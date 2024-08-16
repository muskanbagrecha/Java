package src.designpatterns.decorator.starbucks.condiments;

import src.designpatterns.decorator.starbucks.Beverage;
import src.designpatterns.decorator.starbucks.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage condiment){
        this.beverage = condiment;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        switch (beverage.getSize()){
            case TALL -> cost+=0.20;
            case GRANDE -> cost+=0.15;
            case VENTI -> cost+=0.10;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Mocha ";
    }
}
