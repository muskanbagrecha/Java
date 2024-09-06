package src.LLD.interview.carrentalsystem;

import src.LLD.interview.carrentalsystem.models.*;
import src.LLD.interview.carrentalsystem.payment.CardPaymentStrategy;
import src.LLD.interview.carrentalsystem.types.CarType;

import java.util.Date;
import java.util.List;

public class CarRentalSystemDriver {
    public static void main(String[] args){
        CarRentalSystem carRentalSystem = CarRentalSystem.getInstance();

        //add cars
        Car car1 = new Car("c1", new Model("Maruti", "m1"), "Bangalore", CarType.SEDAN, 100, new LicensePlate("KA", 1234));
        Car car2 = new Car("c2", new Model("Ertiga", "e1"), "Bangalore", CarType.SUV, 300, new LicensePlate("KA", 4329));
        Car car3 = new Car("c3", new Model("Maruti", "m2"), "Chennai", CarType.SEDAN, 150, new LicensePlate("TN", 4334));
        Car car4 = new Car("c4", new Model("Innova", "i1"), "Bangalore", CarType.SEDAN, 100, new LicensePlate("KA", 1233));


        carRentalSystem.addCarToInventory(car1);
        carRentalSystem.addCarToInventory(car2);
        carRentalSystem.addCarToInventory(car3);
        carRentalSystem.addCarToInventory(car4);

        //add users

        User u1 = new User("u1", "Muskan", new DrivingLicense("123", new Date(121026)));
        User u2 = new User("u2", "Adi", new DrivingLicense("2134", new Date(1012010)));
        carRentalSystem.addUser(u1);
        carRentalSystem.addUser(u2);

        //make booking
        List<Car> cars = carRentalSystem.getCarsByFilter("Bangalore", CarType.SEDAN);
        System.out.println(cars);
        String bookingId = carRentalSystem.reserveCar("c1", "u1", new CardPaymentStrategy(), "hdfc card 32542345", 3);
        Booking booking = carRentalSystem.getBookingById(bookingId);
        System.out.println(booking);
        //cancel one booking
        carRentalSystem.cancelBooking(bookingId);
    }
}
