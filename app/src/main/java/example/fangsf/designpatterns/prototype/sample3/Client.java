package example.fangsf.designpatterns.prototype.sample3;

import java.util.List;

/**
 * Created by fangsf on 2018/12/4.
 * Useful:  原型设计模式, 通过原型拷贝出一个新的对象
 *
 * IBox (箱子接口, 拥有多少箱子)
 * CarPartBox(汽车零件箱子)
 * PlasticBox(塑料零件的箱子)
 * TruckCar(卡车, 用来箱子的汽车, 每个车只能装200个)
 *
 *
 */
public class Client {

    public static void main(String[] args) {
        // 假设每个车辆只能装200个箱子,

        CarPartBox carPartBox = new CarPartBox();
        carPartBox.setName("汽车尾灯零件");
        carPartBox.setNumber(500);  // 500个箱子, 只能装下230 个箱子, 需要对其进行拆分

        List<TruckCar> truckCars = CarBoxSplit.splitBox(carPartBox);

        for (TruckCar truckCar : truckCars) {
            int number = truckCar.getBox().getNumber();
            System.out.println("箱子的数量" + number);
        }


    }

}
