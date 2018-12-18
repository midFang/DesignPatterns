package example.fangsf.designpatterns.status.sample1;

/**
 * Created by fangsf on 2018/12/18.
 * Useful:  状态设计模式, 没有运用设计模式的简单实例
 */
public class Client {

    public static void main(String[] args) {

        IOrderOperateStatus order = new Order();

        // 流程是,需要先付款, 然后才能发货
        order.pay();
        order.deliverGoods();

    }

}
