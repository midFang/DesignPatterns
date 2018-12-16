package example.fangsf.designpatterns.flyweight;

import java.util.HashMap;

/**
 * Created by apple on 2018/12/16
 * Useful:  享元设计模式: 对象的复用,
 * 出发点和终点相同的话 , 就不让创建新的对象了
 */
public class TicketFactory {

    private static HashMap<String, Ticket> mTicketInfoMap = new HashMap<>();


    public static Ticket getTicketInfo(String form, String formTo){

        String key = form + "-" + formTo;

        Ticket ticket = mTicketInfoMap.get(key);
        if (ticket != null) {
            return ticket;
        }

        // 将重复的对象缓存起来
        ticket = new TrainTicket(form,formTo);
        mTicketInfoMap.put(key, ticket);


        return ticket;

    }



}
