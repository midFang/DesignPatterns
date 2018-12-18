package example.fangsf.designpatterns.visitor;

/**
 * Created by fangsf on 2018/12/18.
 * Useful:
 */
public class SmallCoffee extends Coffee {

    public SmallCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯的" + mCoffeeAdditives+"咖啡");
    }
}
