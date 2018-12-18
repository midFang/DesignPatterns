package example.fangsf.designpatterns.status.sample2;

/**
 * Created by fangsf on 2018/12/18.
 * Useful: 状态设计模式: 考虑 进行状态的拆分,
 */
public class Client {


    public static void main(String[] args){

        BaseOrder order = new Order();

        ((Order) order).pay();
        ((Order) order).deliverGoods();

    }

}
