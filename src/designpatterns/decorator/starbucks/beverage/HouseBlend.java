package src.designpatterns.decorator.starbucks.beverage;

import src.designpatterns.decorator.starbucks.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        description="Houseblend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
