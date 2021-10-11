public class MyMocha extends CondimentDecorator {
    Beverage beverage;
    
    public MyMocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", MyMocha";
    }

    public double cost() {
        return beverage.cost() + .20;
    }
}
