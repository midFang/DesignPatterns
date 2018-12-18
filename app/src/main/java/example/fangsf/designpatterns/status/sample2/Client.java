package example.fangsf.designpatterns.status.sample2;

import example.fangsf.designpatterns.status.sample2.status.PaidOrderStatus;

/**
 * Created by fangsf on 2018/12/18.
 * Useful:
 */
public class Client {


    public static void main(String[] args){

        BaseOrder order = new Order();

        ((Order) order).pay();
        ((Order) order).deliverGoods();

    }

}
