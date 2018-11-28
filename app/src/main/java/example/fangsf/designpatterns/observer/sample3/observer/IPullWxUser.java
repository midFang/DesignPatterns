package example.fangsf.designpatterns.observer.sample3.observer;

import example.fangsf.designpatterns.observer.sample3.observable.WxPullPublicObservable;

/**
 * Created by apple on 2018/11/28
 * Useful:
 */
public interface IPullWxUser {

    /**
     * 把公众号推荐给用户
     */
    void pull(WxPullPublicObservable publicObservable) ;

}
