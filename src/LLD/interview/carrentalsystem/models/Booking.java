package src.LLD.interview.carrentalsystem.models;

import src.LLD.interview.carrentalsystem.payment.PaymentStrategy;

import java.time.Duration;
import java.util.UUID;

public class Booking {
    UUID bookingId;
    String carId;
    String customerId;
    Duration duration;
    PaymentStrategy paymentStrategy;
    String paymentDetails;
    double amount;

    public Booking(String carId, String customerId, Duration duration, PaymentStrategy paymentStrategy, String paymentDetails, double amount) {
        this.bookingId = UUID.randomUUID();
        this.carId = carId;
        this.customerId = customerId;
        this.duration = duration;
        this.paymentStrategy = paymentStrategy;
        this.paymentDetails = paymentDetails;
        this.amount = amount;
    }

    public UUID getBookingId() {
        return bookingId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return bookingId + " " + customerId + " " + carId + " " + amount;
    }
}

//can have status indicating whether car is still with customer or car is returned
