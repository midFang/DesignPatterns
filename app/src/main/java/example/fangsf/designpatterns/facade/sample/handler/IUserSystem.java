package example.fangsf.designpatterns.facade.sample.handler;

import example.fangsf.designpatterns.facade.sample.User;

/**
 * Created by fangsf on 2018/12/13.
 * Useful: 责任链设计模式,:检验用户的处理接口
 * 让多个对象都有机会处理请求,将这些对象的请求形成一条链,并沿着这条链处理该请求,直到处理完为止
 */
public interface IUserSystem {

    /**
     * 根据用户名处理
     *
     * @param userName
     * @param userId
     * @return
     */
    User queryUserInfo(String userName, String userId);

}
