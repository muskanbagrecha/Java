package src.LLD.interview.carrentalsystem.models;

public class Model {
    private String companyName;
    private String modelNumber;

    public Model(String companyName, String modelNumber) {
        this.companyName = companyName;
        this.modelNumber = modelNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }
}

