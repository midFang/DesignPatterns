package example.fangsf.designpatterns.prototype.sample1;

import java.nio.channels.NonWritableChannelException;
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
        while (iBox.getNumber() > 200) {

            if (iBox instanceof CarPartBox) { //CarPartBox 汽车零件的箱子, 每个卡车只能装200个箱子
                CarPartBox carPartBox = (CarPartBox) iBox;

                CarPartBox newPartBox = new CarPartBox();
                newPartBox.setName(carPartBox.getName());
                newPartBox.setNumber(200);

                TruckCar truckCar = new TruckCar();
                truckCar.addBox(newPartBox);
                truckCarList.add(truckCar);

                iBox.setNumber(iBox.getNumber() - 200);

            } else if (iBox instanceof PlasticBox) {  //PlasticBox 塑料零件的箱子, 每个卡车只能装200个箱子

                PlasticBox plasticBox = (PlasticBox) iBox;

                PlasticBox newPlasticBox = new PlasticBox();
                newPlasticBox.setNumber(200);
                newPlasticBox.setName("塑胶组件");

                TruckCar truckCar = new TruckCar();
                truckCar.addBox(newPlasticBox);
                truckCarList.add(truckCar);

                iBox.setNumber(iBox.getNumber() - 200);

            }

            /**
             *  缺点: 假如是新增加了零件的箱子, 还需要在这个写 else if (iBox instanceof PlasticBox) 这样的判断
             *  代码较多, 很多重复使用的代码
             */


        }


        // 把剩余的箱子装进另外一个卡车
        TruckCar car = new TruckCar();
        car.addBox(iBox);
        truckCarList.add(car);


        return truckCarList;
    }


}
