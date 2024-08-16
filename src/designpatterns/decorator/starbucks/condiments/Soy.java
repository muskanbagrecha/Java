package src.designpatterns.decorator.starbucks.condiments;

import src.designpatterns.decorator.starbucks.Beverage;
import src.designpatterns.decorator.starbucks.CondimentDecorator;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage condiment){
        this.beverage = condiment;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Soy ";
    }
}
