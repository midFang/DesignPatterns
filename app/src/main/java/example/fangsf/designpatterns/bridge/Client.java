package example.fangsf.designpatterns.bridge;

/**
 * Created by fangsf on 2018/12/18.
 * 桥接设计模式
 */
public class Client {

    public static void main(String[] args) {

        // 要一杯小杯的加糖咖啡
        Surge surge = new Surge(); // 加糖
        SmallCoffee smallCoffee = new SmallCoffee(surge);
        smallCoffee.makeCoffee();

        // 要一杯大杯的原味咖啡
        Original original = new Original();
        LargeCoffee largeCoffee = new LargeCoffee(original);
        largeCoffee.makeCoffee();


    }


}
