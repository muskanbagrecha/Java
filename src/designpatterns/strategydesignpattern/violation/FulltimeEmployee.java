package src.designpatterns.strategydesignpattern.violation;

public class FulltimeEmployee extends Employee{
    @Override
    public void payEmployee() {
        super.payEmployee();
        System.out.println("Paying "+ super.getName() + "a salary of Rs." + super.getSalary()); //duplicated code
        processSalary();
    }

    public void processSalary(){
        //duplicated code written here, this is violation as same code needs to be written in ParttimeEmployee class.
    }
}
