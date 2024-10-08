package src.designpatterns.decorator.coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getCoffeeInfo() {
        return this.decoratedCoffee.getCoffeeInfo();
    }

    @Override
    public double getCoffeeCost() {
        return this.decoratedCoffee.getCoffeeCost();
    }
}
