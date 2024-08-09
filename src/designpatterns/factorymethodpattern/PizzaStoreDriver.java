package src.designpatterns.factorymethodpattern;

public class PizzaStoreDriver {
    public static void main(String[] args){
        PizzaStore NYPizzaStore = new NyPizzaStore();
        NYPizzaStore.orderPizza("veggie");
        System.out.println("----------------------");
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("cheese");
    }
}
