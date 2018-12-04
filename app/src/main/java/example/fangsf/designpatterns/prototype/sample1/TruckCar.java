package example.fangsf.designpatterns.prototype.sample1;

/**
 * Created by fangsf on 2018/12/4.
 * Useful:
 */
public class TruckCar {

    private IBox mIBox;


    public void addBox(IBox iBox) {
        this.mIBox = iBox;
    }


    public IBox getBox(){
        return mIBox;
    }


}
