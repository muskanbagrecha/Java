package src.LLD.interview.carrentalsystem.models;

import java.util.Date;

public class DrivingLicense {
    private String drivingLicenseId;
    private Date expiryDate;

    public DrivingLicense(String drivingLicenseId, Date expiryDate) {
        this.drivingLicenseId = drivingLicenseId;
        this.expiryDate = expiryDate;
    }

    public String getDrivingLicenseId() {
        return drivingLicenseId;
    }

    public void setDrivingLicenseId(String drivingLicenseId) {
        this.drivingLicenseId = drivingLicenseId;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}
