package example.fangsf.designpatterns.prototype.sample3;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by fangsf on 2018/12/4.
 * Useful:  装箱子的汽车, 对箱子数量进行拆分  (订单拆分)
 */
public class CarBoxSplit {


    public static List<TruckCar> splitBox(IBox iBox) {

        List<TruckCar> truckCarList = new ArrayList<>();

        // 进行拆分
        while (iBox.getNumber() > 230) {

            try {
                IBox clone = iBox.clone();
                clone.setNumber(230);

                TruckCar truckCar = new TruckCar();
                truckCar.addBox(clone);
                truckCarList.add(truckCar);

                iBox.setNumber(iBox.getNumber() - 230);

            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

        }

        // 把剩余的箱子装进另外一个卡车
        TruckCar car = new TruckCar();
        car.addBox(iBox);
        truckCarList.add(car);


        return truckCarList;
    }


}
