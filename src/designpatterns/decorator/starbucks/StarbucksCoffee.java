package src.designpatterns.decorator.starbucks;

import src.designpatterns.decorator.starbucks.beverage.Espresso;
import src.designpatterns.decorator.starbucks.beverage.HouseBlend;
import src.designpatterns.decorator.starbucks.condiments.Mocha;
import src.designpatterns.decorator.starbucks.condiments.Whip;

public class StarbucksCoffee {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        Beverage beverage1 = new HouseBlend();
        beverage1.setSize(Beverage.Size.TALL);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
