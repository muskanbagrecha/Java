package src.LLD.interview.carrentalsystem.models;

public class LicensePlate {
    private String stateCode;
    private int uniqueNumber;

    public LicensePlate(String stateCode, int uniqueNumber) {
        if (stateCode.length() > 2 || uniqueNumber > 9999) {
            throw new IllegalArgumentException("Invalid");
        }
        this.stateCode = stateCode;
        this.uniqueNumber = uniqueNumber;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }
}
