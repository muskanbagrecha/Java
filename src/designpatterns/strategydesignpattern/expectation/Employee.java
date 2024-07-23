package src.designpatterns.strategydesignpattern.expectation;

public class Employee {
    EmployeePayments employeePayments;

    public Employee(EmployeePayments employeePayments){
        this.employeePayments = employeePayments;
    }
    public void payEmployee(){
        double payment = employeePayments.calculatePayment();
        System.out.println("Processing payment of amount: " + payment);
        //some common payment code (common for both employees)
        employeePayments.processPayments();
    }
}
