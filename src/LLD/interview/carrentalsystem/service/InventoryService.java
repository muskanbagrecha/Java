package src.LLD.interview.carrentalsystem.service;

import src.LLD.interview.carrentalsystem.models.Car;
import src.LLD.interview.carrentalsystem.models.Status;
import src.LLD.interview.carrentalsystem.types.CarType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InventoryService {

    HashMap<String, Car> carsInventory;

    public InventoryService() {
        this.carsInventory = new HashMap<>();
    }

    public List<Car> getCarsByFilters(String city, CarType carType, double minPrice, double maxPrice){
        List<Car> filteredCars = new ArrayList<>();
        for(Car car : carsInventory.values()){
            if(car.getCity().equals(city) && car.getCarType().equals(carType) && car.getRate()>=minPrice && car.getRate()<=maxPrice && car.getStatus().equals(Status.AVAILABLE)){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    public void addCar(Car car){
        if(carsInventory.containsKey(car.getId())){
            throw new IllegalArgumentException();
        }
        carsInventory.put(car.getId(), car);
    }

    public Car getCarById(String carId){
        return carsInventory.get(carId);
    }

    public Car reserveCar(String carId){
        Car car = carsInventory.get(carId);
        if(car.getStatus().equals(Status.RESERVED)){
            return null;
        }
        car.setStatus(Status.RESERVED);
        return car;
    }

    public synchronized boolean releaseReservation(String carId){
        Car car = carsInventory.get(carId);
        if(!car.getStatus().equals(Status.RESERVED)){
            return false;
        }
        car.setStatus(Status.AVAILABLE);
        return true;
    }
}
