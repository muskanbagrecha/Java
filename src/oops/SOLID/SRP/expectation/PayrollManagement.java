package src.oops.SOLID.SRP.expectation;

import java.util.List;
import src.oops.SOLID.SRP.Employee;

public class PayrollManagement {

    public void paySalaries(List<Employee> employees) {
        for(Employee emp : employees){
            System.out.println("Paying salary to" + emp.getName());
        }
    }
}

