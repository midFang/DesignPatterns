package example.fangsf.designpatterns.status.sample2.status;

/**
 * Created by fangsf on 2018/12/18.
 * Useful: 具体的 代付款 状态
 */
public class ObligationOrderStatus implements IOrderOperateStatus {
    @Override
    public void pay() {
        System.out.println("付款成功");
    }

    @Override
    public void deliverGoods() {
        System.out.println("不在状态");
    }
}
