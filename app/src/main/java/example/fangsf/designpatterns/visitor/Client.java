package example.fangsf.designpatterns.visitor;

/**
 * Created by fangsf on 2018/12/18.
 * Useful: 访问者设计模式: 封装了一个类, 但是修改这个类的属性,是通过另外一个类的
 * <p>
 * 有两种咖啡, 一种是加糖和不加糖的(咖啡属性), 要求有大杯,中杯, 小杯,
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
