package src.designpatterns.decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getCoffeeInfo() {
        return decoratedCoffee.getCoffeeInfo() + ", Sugar";
    }

    @Override
    public double getCoffeeCost() {
        return 0;
    }
}
