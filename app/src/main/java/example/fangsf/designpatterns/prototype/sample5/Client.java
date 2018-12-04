package example.fangsf.designpatterns.prototype.sample5;

/**
 * Created by fangsf on 2018/12/4.
 * Useful:  原型设计模式, 通过原型拷贝出一个新的对象
 * 深拷贝
 */
public class Client {

    public static void main(String[] args) {

        User user = new User();
        user.name = "zhangsan";
        user.age = "22";
        user.address = new Address("上海");

        //  System.out.println("--" + user.name + " -- " + user.age + " --- " + user.address.addressDetails);

        try {
            User clone = user.clone();
            clone.age = "44";
            clone.name = "lisi";

            clone.address.addressDetails = "江西";
            System.out.println("--" + user.name + " -- " + user.age + " --- " + user.address.addressDetails);
            System.out.println("--" + clone.name + " -- " + clone.age + " --- " + clone.address.addressDetails);

            /**
             * --zhangsan -- 22 --- 上海
             * --lisi -- 44 --- 江西
             */


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }

}
