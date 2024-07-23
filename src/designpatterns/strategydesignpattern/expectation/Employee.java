package src.designpatterns.strategydesignpattern.expectation;

public class Employee {
    private final String name;
    EmployeePaymentsStrategy employeePaymentsStrategy;

    public Employee(String name, EmployeePaymentsStrategy employeePaymentsStrategy){
        this.name = name;
        this.employeePaymentsStrategy = employeePaymentsStrategy;
    }
    public void payEmployee(){
        double payment = employeePaymentsStrategy.calculatePayment();
        System.out.println("Processing payment of amount: " + payment + " to " + name);
        //some common payment code (common for both employees)
        employeePaymentsStrategy.processPayments();
    }
}
