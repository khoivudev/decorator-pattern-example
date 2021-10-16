package MainDrink;

import Beverage.Beverage;

public class Decaf extends Beverage {
    public Decaf(Size size) {
        description = "Decaf";
        setSize(size);
    }

    public double cost() {
        return 1.05;
    }
}
