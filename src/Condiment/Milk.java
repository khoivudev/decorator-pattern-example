package Condiment;

import Beverage.Beverage;

public class Milk extends CondimentDecorator {   
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Steamed Milk";
    }

    public double cost() {
        return beverage.cost() + .10;
    }
}
