package src.LLD.interview.carrentalsystem;

import src.LLD.interview.carrentalsystem.models.Booking;
import src.LLD.interview.carrentalsystem.models.Car;
import src.LLD.interview.carrentalsystem.models.User;
import src.LLD.interview.carrentalsystem.payment.PaymentStrategy;
import src.LLD.interview.carrentalsystem.service.UserService;
import src.LLD.interview.carrentalsystem.service.InventoryService;
import src.LLD.interview.carrentalsystem.types.CarType;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

public class CarRentalSystem {
    private static CarRentalSystem carRentalSystem;
    private InventoryService inventoryService;
    private UserService userService;
    private HashMap<String, Booking> bookingHashMap;

    private CarRentalSystem(InventoryService inventoryService, UserService userService) {
        this.inventoryService = inventoryService;
        this.userService = userService;
        this.bookingHashMap = new HashMap<>();
    }

    //singleton
    public static CarRentalSystem getInstance() {
        if (carRentalSystem == null) {
            carRentalSystem = new CarRentalSystem(
                    new InventoryService(),
                    new UserService()
            );
        }
        return carRentalSystem;
    }

    boolean addUser(User user){
        userService.addCustomer(user);
        return true;
    }

    List<Car> getCarsByFilters(String city, CarType type, double minPrice, double maxPrice) {
        return inventoryService.getCarsByFilters(city, type, minPrice, maxPrice);
    }

    List<Car> getCarsByFilter(String city, CarType type) {
        return getCarsByFilters(city, type, Double.MIN_VALUE, Double.MAX_VALUE);
    }

    synchronized String reserveCar(String carId, String customerId, PaymentStrategy paymentStrategy, String paymentDetails, int days) {
        //can add logic here to check customer license is valid or not
        Car car = inventoryService.reserveCar(carId);
        if (car == null) {
            return null; //car is reserved
        }
        synchronized (car){
            User user = userService.getCustomerbyId(customerId);
            user.setPaymentDetails(paymentDetails);
            double amt = car.getRate() * days;
            paymentStrategy.makePayment(paymentDetails, amt);
            Booking booking = new Booking(carId, customerId, Duration.ofDays(days), paymentStrategy, paymentDetails, amt);
            bookingHashMap.put(booking.getBookingId().toString(), booking);
            return booking.getBookingId().toString();
        }
    }

    void releaseCar(String carId, String customerId){
        inventoryService.releaseReservation(carId);
    }

    boolean cancelBooking(String bookingId) {
        if (!bookingHashMap.containsKey(bookingId)) {
            return false;
        }
        Booking booking = bookingHashMap.get(bookingId);
        String carId = booking.getCarId();
        bookingHashMap.remove(bookingId);
        inventoryService.releaseReservation(carId);
        //processrefund
        booking.getPaymentStrategy().makeRefund(booking.getPaymentDetails(), booking.getAmount());
        return true;
    }

    void addCarToInventory(Car car) {
        inventoryService.addCar(car);
    }

    Booking getBookingById(String bookingId){
        return bookingHashMap.get(bookingId);
    }

}
