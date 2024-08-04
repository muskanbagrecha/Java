package src.designpatterns.decorator.pizza;

public class CheesePizza extends ToppingsDecorator {

    public CheesePizza(Pizza decoratedPizza){
        super(decoratedPizza);
    }

    @Override
    public String type() {
        return decoratedPizza.type() + " + Cheese";
    }

    @Override
    public double cost(){
        return decoratedPizza.cost() + 20;
    }
}
