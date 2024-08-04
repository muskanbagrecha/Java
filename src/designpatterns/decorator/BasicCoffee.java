package src.designpatterns.decorator;

public class BasicCoffee implements Coffee{
    @Override
    public String getCoffeeInfo() {
        return "Coffee";
    }

    @Override
    public double getCoffeeCost() {
        return 10;
    }
}
