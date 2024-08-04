package src.designpatterns.decorator.pizza;

public class FarmhousePizza implements Pizza{
    @Override
    public String type() {
        return "Farmhouse Pizza";
    }

    @Override
    public double cost() {
        return 200;
    }
}
