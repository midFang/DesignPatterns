package example.fangsf.designpatterns.prototype.sample4;

/**
 * Created by fangsf on 2018/12/4.
 * Useful:
 */
public class User implements Cloneable {

    public String name;
    public String age;
    public Address address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    public static class Address{
        public String addressDetails;

        public Address(String addressDetails) {
            this.addressDetails = addressDetails;
        }
    }


}
