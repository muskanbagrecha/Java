package src.designpatterns.factorymethodpattern;

import src.designpatterns.factorymethodpattern.chicagopizzas.ChicagoStyleCheesePizza;
import src.designpatterns.factorymethodpattern.chicagopizzas.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        return switch (type){
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            default -> null;
        };
    }
}
