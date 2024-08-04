package src.designpatterns.decorator.coffee;

public class CoffeeDecoratorDriver {
    public static void main(String[] args) {
       Coffee coffee = new BasicCoffee();
         System.out.println("Cost: " + coffee.getCoffeeCost() + "; Ingredients: " + coffee.getCoffeeInfo());
         coffee = new MilkDecorator(coffee);
         System.out.println("Cost: " + coffee.getCoffeeCost() + "; Ingredients: " + coffee.getCoffeeInfo());
         coffee = new SugarDecorator(coffee);
         System.out.println("Cost: " + coffee.getCoffeeCost() + "; Ingredients: " + coffee.getCoffeeInfo());
    }
}
