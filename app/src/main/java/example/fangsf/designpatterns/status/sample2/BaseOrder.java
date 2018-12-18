package example.fangsf.designpatterns.status.sample2;

import example.fangsf.designpatterns.status.sample2.status.IOrderOperateStatus;

/**
 * Created by fangsf on 2018/12/18.
 * Useful: 订单的基类
 */
public class BaseOrder {

    protected IOrderOperateStatus mOrderOperateStatus;

    public BaseOrder(IOrderOperateStatus orderOperateStatus) {
        mOrderOperateStatus = orderOperateStatus;
    }

    /**
     * 更改订单状态
     * @param status
     */
    public void setStatus(IOrderOperateStatus status){
        this.mOrderOperateStatus = status;
    }

}
