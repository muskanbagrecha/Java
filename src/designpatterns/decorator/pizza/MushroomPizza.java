package src.designpatterns.decorator.pizza;

public class MushroomPizza extends ToppingsDecorator{

    public MushroomPizza(Pizza decoratedPizza){
        super(decoratedPizza);
    }

    @Override
    public String type() {
        return decoratedPizza.type() + " + mushroom";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 5;
    }
}
