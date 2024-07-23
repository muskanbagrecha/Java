package src.designpatterns.strategydesignpattern.violation;

public class Employee {
    private String name;
    private double salary;

    public void payEmployee(){
        System.out.println("Start payment process. Individual subclasses will determine the actual pay based on employee type.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
