package example.fangsf.designpatterns.status.sample1;

/**
 * Created by fangsf on 2018/12/18.
 * Useful: 实例: 一个订单,发货有几种状态, 未付款前, 处于待支付状态, 支付完成后,处于代发货状态, 发货后,处于代收货状态
 */
public class Order implements IOrderOperateStatus {

    public final int OBLIGATION = 1;// 代付款
    public final int PAID = 2;// 付款
    public final int WAITRECEIVING = 3;// 待收货
    public final int WAITCOMMENT = 4;// 待评价

    // 当前默认的订单状态
    public int mStatus = OBLIGATION;

    @Override
    public void pay() {

        // 假设,后期, 这个订单又增加了其他的状态,获取是什么业务逻辑的操作, 那都会写在这个地方,耦合太严重了,没有拆分

        if (mStatus == OBLIGATION) {
            System.out.println("付款");
            mStatus = PAID;
        } else {
            System.out.println("不在状态");
        }

    }

    @Override
    public void deliverGoods() {

        if (mStatus == PAID) {
            System.out.println("发货");
            mStatus = WAITRECEIVING;
        } else {
            System.out.println("不在状态");
        }

    }
}
