package src.designpatterns.decorator;

public class MilkDecorator extends CoffeeDecorator {
    public  MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getCoffeeInfo() {
        return decoratedCoffee.getCoffeeInfo() + ", Milk";
    }

    @Override
    public double getCoffeeCost() {
        super.getCoffeeCost();
        return super.getCoffeeCost()+5;
    }
}
