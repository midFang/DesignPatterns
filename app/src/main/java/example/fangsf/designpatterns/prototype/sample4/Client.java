package example.fangsf.designpatterns.prototype.sample4;

import java.util.List;

import example.fangsf.designpatterns.prototype.sample3.CarBoxSplit;
import example.fangsf.designpatterns.prototype.sample3.CarPartBox;
import example.fangsf.designpatterns.prototype.sample3.TruckCar;

/**
 * Created by fangsf on 2018/12/4.
 * Useful:  原型设计模式, 通过原型拷贝出一个新的对象
 * 浅拷贝
 */
public class Client {

    public static void main(String[] args) {

        User user = new User();
        user.name = "zhangsan";
        user.age = "22";
        user.address = new User.Address("上海");

        //  System.out.println("--" + user.name + " -- " + user.age + " --- " + user.address.addressDetails);

        try {
            User clone = user.clone();
            clone.age = "44";
            clone.name = "lisi";

            clone.address.addressDetails = "江西";
            System.out.println("--" + user.name + " -- " + user.age + " --- " + user.address.addressDetails);
            System.out.println("--" + clone.name + " -- " + clone.age + " --- " + clone.address.addressDetails);

            /**
             * 理想结果
             * --zhangsan -- 22 --- 上海
             * --lisi -- 44 --- 江西
             * 答应结果
             * --zhangsan -- 22 --- 江西
             * --lisi -- 44 --- 江西
             */

            // 可以发现, clone.address.addressDetails 并没有完全拷贝出一份新的, 而是公用的一份
            // 浅拷贝，就是类中的类对象实例，是没有被拷贝的，他们还是公用一份

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }

}
