package src.designpatterns.factorymethodpattern.chicagopizzas;

import src.designpatterns.factorymethodpattern.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(){
        name="Chicago Style Deep Dish Cheese Pizza";
        dough="Extra Thick Crust Dough";
        sauce="Plum tomato sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    protected void cut() {
        System.out.println("Cut in square slices.");
    }
}
