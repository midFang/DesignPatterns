package example.fangsf.designpatterns.visitor;

/**
 * Created by fangsf on 2018/12/18.
 * Useful:
 */
public abstract class Coffee {

    protected CoffeeAdditives mCoffeeAdditives;

    public Coffee(CoffeeAdditives coffeeAdditives) { // 通过引用的方式, 修改原有类属性参数(通过另外一个类,是否需要大,中,小,杯的咖啡)
        mCoffeeAdditives = coffeeAdditives;
    }

    // 制作咖啡
    public abstract void makeCoffee();


}
