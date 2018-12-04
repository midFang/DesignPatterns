package example.fangsf.designpatterns.prototype.sample5;

/**
 * Created by fangsf on 2018/12/4.
 * Useful:
 */
public class Address implements Cloneable {

    public String addressDetails;

    public Address(String addressDetails) {
        this.addressDetails = addressDetails;
    }

    @Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}
