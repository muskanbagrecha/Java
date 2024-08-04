package src.designpatterns.decorator.pizza;

public class MargaritaPizza implements Pizza{
    @Override
    public String type() {
        return "Margarita pizza";
    }

    @Override
    public double cost() {
        return 100;
    }
}
