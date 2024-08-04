package src.designpatterns.decorator.pizza;

public abstract class ToppingsDecorator implements Pizza{
    protected Pizza decoratedPizza;

    public ToppingsDecorator(Pizza decoratedPizza){
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String type() {
        return decoratedPizza.type();
    }

    @Override
    public double cost() {
        return decoratedPizza.cost();
    }
}
