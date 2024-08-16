package src.designpatterns.decorator.starbucks.condiments;

import src.designpatterns.decorator.starbucks.Beverage;
import src.designpatterns.decorator.starbucks.CondimentDecorator;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage condiment){
        this.beverage = condiment;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Whip ";
    }
}
