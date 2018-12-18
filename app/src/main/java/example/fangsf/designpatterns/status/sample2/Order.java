package example.fangsf.designpatterns.status.sample2;

import example.fangsf.designpatterns.status.sample2.status.IOrderOperateStatus;
import example.fangsf.designpatterns.status.sample2.status.ObligationOrderStatus;
import example.fangsf.designpatterns.status.sample2.status.PaidOrderStatus;
import example.fangsf.designpatterns.status.sample2.status.WaitreceivingOrderStatus;

/**
 * Created by fangsf on 2018/12/18.
 * Useful: 实例: 一个订单,发货有几种状态, 未付款前, 处于待支付状态, 支付完成后,处于代发货状态, 发货后,处于代收货状态
 */
public class Order extends BaseOrder implements IOrderOperateStatus {

    public Order() {
        super(new ObligationOrderStatus()); // 默认是代付款 状态
    }


    @Override
    public void pay() {
        mOrderOperateStatus.pay();  //已付款

        setStatus(new PaidOrderStatus()); // 更改状态为已经发货
    }

    @Override
    public void deliverGoods() {
        mOrderOperateStatus.deliverGoods(); // 已经发货

        setStatus(new WaitreceivingOrderStatus());  // 更改状态为,等待收货
    }

    // 假设这里我要评价这个订单,
    /**
     * public void appraise(){
     *     mOrderOperateStatus.appraise();
     *
     *     // 评价过后, 就是追加评价的状态了
     *     mOrderOperateStatus.追加评价();
     * }
     */


}
