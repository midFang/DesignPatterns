package example.fangsf.designpatterns.observer.sample3.observer;

import example.fangsf.designpatterns.observer.sample3.observable.WxPullPublicObservable;
import example.fangsf.designpatterns.observer.sample3.observable.WxPullPublicProObserver;

/**
 * Created by apple on 2018/11/28
 * Useful:
 */
public class WxPullUser implements IPullWxUser {

    private final String name;

    public WxPullUser(String name){
        this.name = name;
    }


    @Override
    public void pull(WxPullPublicObservable publicObservable) {
        WxPullPublicProObserver publicObservable1 = (WxPullPublicProObserver) publicObservable;

        String article = publicObservable1.getArticle();

        System.out.println(name + " 主动拉去一篇文章：" + article);
    }
}
