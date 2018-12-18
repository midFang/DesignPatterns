package example.fangsf.designpatterns.status.sample2.status;

/**
 * Created by fangsf on 2018/12/18.
 * Useful: 订单的状态
 */
public interface IOrderOperateStatus {

    // 付款
    void pay();

    // 发货
    void deliverGoods();

}
