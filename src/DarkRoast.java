public class DarkRoast extends Beverage{
    public DarkRoast(Size size) {
        description = "DarkRoast";
        setSize(size);
    }

    public double cost() {
        return 0.99;
    }
}
