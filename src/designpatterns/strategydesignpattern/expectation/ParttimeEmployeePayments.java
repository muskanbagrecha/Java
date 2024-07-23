package src.designpatterns.strategydesignpattern.expectation;

public class ParttimeEmployeePayments implements EmployeePayments{
    private double rate;
    private int hours;

    public ParttimeEmployeePayments(double rate, int hours) {
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public double calculatePayment() {
        return rate * hours;
    }

    @Override
    public void processPayments() {
        System.out.println("Processing payment for part-time employee"); //this can also be extracted to a separate class for SRP. but not doing it now.
    }
}
