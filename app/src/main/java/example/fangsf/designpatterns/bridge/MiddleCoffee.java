package example.fangsf.designpatterns.bridge;

/**
 * Created by fangsf on 2018/12/18.
 * Useful:
 */
public class MiddleCoffee extends Coffee {

    public MiddleCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        System.out.println("中杯的" + mCoffeeAdditives+"咖啡");
    }
}
