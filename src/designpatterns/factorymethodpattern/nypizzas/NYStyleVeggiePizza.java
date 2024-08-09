package src.designpatterns.factorymethodpattern.nypizzas;

import src.designpatterns.factorymethodpattern.Pizza;

public class NYStyleVeggiePizza extends Pizza {

        public NYStyleVeggiePizza() {
            name = "NY Style Veggie Pizza";
            dough = "Thin Crust Dough";
            sauce = "Marinara Sauce";
            toppings.add("Veggies");
        }
}
