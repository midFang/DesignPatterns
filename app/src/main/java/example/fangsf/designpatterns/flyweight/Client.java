package example.fangsf.designpatterns.flyweight;

import android.icu.util.TaiwanCalendar;

/**
 * Created by apple on 2018/12/16
 * Useful: 享元设计模式, 指的是就是对象的复用
 */
public class Client {

    public static void main(String [] args){


        // 假设有1000 个人 购买火车票
        for (int i = 0; i < 1000; i++) {

            //同一个出发点和终点站,避免重复创建对象,需要复用
            Ticket ticketInfo = TicketFactory.getTicketInfo("深圳", "江西");

            ticketInfo.showTicketInfo();
        }






    }

}
