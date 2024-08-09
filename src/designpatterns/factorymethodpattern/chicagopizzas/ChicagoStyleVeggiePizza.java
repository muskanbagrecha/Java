package src.designpatterns.factorymethodpattern.chicagopizzas;

import src.designpatterns.factorymethodpattern.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

        public ChicagoStyleVeggiePizza() {
            name = "Chicago Deep Dish Veggie Pizza";
            dough = "Extra Thick Crust Dough";
            sauce = "Plum Tomato Sauce";
            toppings.add("Veggies");
        }
}
