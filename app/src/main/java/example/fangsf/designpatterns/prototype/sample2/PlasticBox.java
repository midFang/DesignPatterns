package example.fangsf.designpatterns.prototype.sample2;

/**
 * Created by fangsf on 2018/12/4.
 * Useful:
 */
public class PlasticBox implements IBox {

    private int mNumber;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setNumber(int number) {
        this.mNumber = number;
    }

    @Override
    public int getNumber() {
        return mNumber;
    }

    @Override
    public IBox copy() {
        PlasticBox plasticBox = new PlasticBox();
        plasticBox.setName(this.name);
        plasticBox.setNumber(200);
        return plasticBox;
    }
}
