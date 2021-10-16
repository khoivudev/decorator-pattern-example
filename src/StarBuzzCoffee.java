import Beverage.Beverage;
import Condiment.*;
import MainDrink.*;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(Beverage.Size.GRANDE);
        System.out.println(beverage.getDescription() + " $" + beverage.cost() + " size:"+ beverage.getSize());

        Beverage beverage2 = new DarkRoast(Beverage.Size.VENTI);
        beverage2 = new MyMocha(beverage2);
        beverage2 = new MyMocha(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost()+ " size:"+ beverage2.getSize());
    
        Beverage beverage3 = new HouseBlend(Beverage.Size.TALL);
        beverage3 = new Soy(beverage3);
        beverage3 = new MyMocha(beverage3);
        beverage3 = new Whip(beverage3);
        //beverage3 = new Soy(beverage2);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost() + " size:"+ beverage3.getSize());
    }
}
