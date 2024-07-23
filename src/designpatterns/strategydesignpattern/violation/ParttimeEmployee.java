package src.designpatterns.strategydesignpattern.violation;

public class ParttimeEmployee extends Employee {
    private int hours;
    private double rate;

    public ParttimeEmployee(int hours, double rate) {
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public void payEmployee() {
        super.payEmployee();
        double salary = hours * rate;
        System.out.println("Paying "+ super.getName() + "a salary of Rs." + super.getSalary()); //duplicated code
        processSalary();
    }

    public void processSalary(){
        //duplicated code written here, this is violation as same code needs to be written in FulltimeEmployee class.
    }
}
