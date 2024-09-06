package src.LLD.interview.carrentalsystem.models;

import src.LLD.interview.carrentalsystem.types.CarType;

public class Car {
    private String id;
    private Model model;
    private String city;
    private CarType carType;
    private double rate;
    private Status status;
    private LicensePlate licensePlate;

    public Car(String id, Model model, String city, CarType carType, double rate, LicensePlate licensePlate) {
        this.id = id;
        this.model = model;
        this.city = city;
        this.carType = carType;
        this.rate = rate;
        this.status = Status.AVAILABLE;
        this.licensePlate = licensePlate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LicensePlate getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(LicensePlate licensePlate) {
        this.licensePlate = licensePlate;
    }
}
