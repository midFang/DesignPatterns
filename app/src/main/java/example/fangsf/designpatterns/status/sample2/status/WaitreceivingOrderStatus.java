package example.fangsf.designpatterns.status.sample2.status;

/**
 * Created by fangsf on 2018/12/18.
 * Useful: 具体的待收货 状态
 */
public class WaitreceivingOrderStatus implements IOrderOperateStatus{
    @Override
    public void pay() {
        System.out.println("不在状态");
    }

    @Override
    public void deliverGoods() {
        System.out.println("不在状态");
    }
}
