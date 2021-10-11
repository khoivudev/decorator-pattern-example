public class HouseBlend extends Beverage{
    public HouseBlend(Size size) {
        description = "House Blend Coffee";
        setSize(size);
    }

    public double cost() {
        return .89;
    }
}
