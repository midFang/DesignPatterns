package example.fangsf.designpatterns.observer.sample3;

import example.fangsf.designpatterns.observer.sample3.observable.WxPullPublicObservable;
import example.fangsf.designpatterns.observer.sample3.observable.WxPullPublicProObserver;
import example.fangsf.designpatterns.observer.sample3.observer.WxPullUser;

/**
 * Created by apple on 2018/11/28
 * Useful:  拉模式, 用户关注公众号, 主动拉取文章
 */
public class Client {


    public static void main(String[] args) {


        // 具体的微信公众号
        WxPullPublicProObserver wxPullPublicObservable = new WxPullPublicProObserver();


        WxPullUser wxPullUser = new WxPullUser("xiaohong");
        WxPullUser wxPullUser2 = new WxPullUser("xiaojiang");


        // 订阅公众号
        wxPullPublicObservable.register(wxPullUser);
        wxPullPublicObservable.register(wxPullUser2);

        wxPullPublicObservable.setArticle("《代理设计模式 - 实现 Retrofit 的 create》");
        wxPullPublicObservable.setArticle("第三方框架 - EventBus 源码分析和手写");

        wxPullPublicObservable.unRegister(wxPullUser2);


        wxPullPublicObservable.setArticle("第三方框架 - RxJava2 源码分析和手写");


    }


}
