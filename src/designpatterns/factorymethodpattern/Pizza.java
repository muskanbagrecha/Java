package src.designpatterns.factorymethodpattern;

import java.util.ArrayList;

public abstract class Pizza {
    public String name;
    protected String dough;
    protected String sauce;
    protected ArrayList toppings = new ArrayList();

    protected void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    protected void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    protected void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    protected void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (Object topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    public String getName() { return name; }
}
