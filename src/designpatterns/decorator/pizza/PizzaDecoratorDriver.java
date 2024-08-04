package src.designpatterns.decorator.pizza;

public class PizzaDecoratorDriver {

    public static void main(String[] args){
        Pizza margaritaPizza = new CheesePizza(new MargaritaPizza());
        System.out.println(margaritaPizza.type() + " :: " + margaritaPizza.cost());
        Pizza farmhousePizza = new CheesePizza(new MushroomPizza(new FarmhousePizza()));
        System.out.println(farmhousePizza.type() + " :: " + farmhousePizza.cost());
    }

}
