package example.fangsf.designpatterns.prototype.sample5;

/**
 * Created by fangsf on 2018/12/4.
 * Useful:
 */
public class User implements Cloneable {

    public String name;
    public String age;
    public Address address;


       @Override
    protected User clone() throws CloneNotSupportedException {
        User clone = (User) super.clone();

        // 把地址 address 也做一次克隆，达到深拷贝
        address = address.clone(); // 重写这个方法, 手动调用address的克隆方法, copy出新的一份

        return clone;
    }


}
