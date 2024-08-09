package src.designpatterns.factorymethodpattern;

public abstract class PizzaStore {

    public void orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        if(pizza==null){
            System.out.println("Could not create pizza. Select another type.");
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    //factory method
    protected abstract Pizza createPizza(String type);

}
