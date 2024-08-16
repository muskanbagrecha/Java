package src.designpatterns.decorator.starbucks.beverage;

import src.designpatterns.decorator.starbucks.Beverage;

public class Decaf extends Beverage {
    public Decaf(){
        description="Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
