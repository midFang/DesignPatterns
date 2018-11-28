package example.fangsf.designpatterns.observer.sample2.observable;

import java.util.Observable;
import java.util.Observer;

import example.fangsf.designpatterns.observer.sample1.observable.WXPublicObservable;

/**
 * Created by apple on 2018/11/28
 * Useful:
 */
public class WxPublicProObservable extends Observable{


    public void setArticle(String article) {

        setChanged();

        // 通知用户更新
        notifyObservers(article);


    }


}
