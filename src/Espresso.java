public class Espresso extends Beverage{
    public Espresso(Size size) {
        description = "Espresso";
        setSize(size);
    }

    public double cost() {
        return 1.99;
    }
}
