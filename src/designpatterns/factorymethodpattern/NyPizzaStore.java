package src.designpatterns.factorymethodpattern;

import src.designpatterns.factorymethodpattern.nypizzas.NYStyleCheesePizza;
import src.designpatterns.factorymethodpattern.nypizzas.NYStyleVeggiePizza;

public class NyPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            case "veggie" -> new NYStyleVeggiePizza();
            default -> null;
        };
    }
}
