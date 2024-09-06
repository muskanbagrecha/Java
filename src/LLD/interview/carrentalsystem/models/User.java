package src.LLD.interview.carrentalsystem.models;

public class User {
    private String userId;
    private String name;
    private DrivingLicense drivingLicense;
    private String paymentDetails;

    public User(String userId, String name, DrivingLicense drivingLicense) {
        this.userId = userId;
        this.name = name;
        this.drivingLicense = drivingLicense;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DrivingLicense getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(DrivingLicense drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }
}
