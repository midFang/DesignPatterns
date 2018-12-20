package example.fangsf.designpatterns.bridge;

/**
 * Created by fangsf on 2018/12/18.
 * Useful:
 */
public class LargeCoffee extends Coffee {

    public LargeCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯的" + mCoffeeAdditives+"咖啡");
    }
}
