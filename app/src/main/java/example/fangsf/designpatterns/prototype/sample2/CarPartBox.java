package example.fangsf.designpatterns.prototype.sample2;

/**
 * Created by fangsf on 2018/12/4.
 * Useful:  装汽车零件的箱子
 */
public class CarPartBox implements IBox {

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
        /**
         * copy 只能有200个箱子,  copy 出一个新的对象
         */


        CarPartBox carPartBox = new CarPartBox();
        carPartBox.setName(this.name);
        carPartBox.setNumber(200);
        return carPartBox;
    }
}
