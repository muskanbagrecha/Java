package src.designpatterns.strategydesignpattern.expectation;

public class FulltimeEmployeePaymentsStrategy implements EmployeePaymentsStrategy {

    private double salary;

    public FulltimeEmployeePaymentsStrategy(double salary) {
        this.salary = salary;
    }

    @Override
    public void processPayments() { //this can also be extracted to a separate class for SRP. but not doing it now.
        System.out.println("Processing payment for full-time employee");
    }

    @Override
    public double calculatePayment() {
        return salary;
    }
}
