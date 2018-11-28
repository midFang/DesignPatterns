package example.fangsf.designpatterns.observer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import example.fangsf.designpatterns.R;
import example.fangsf.designpatterns.observer.sample1.observable.WxPublicProObservable;
import example.fangsf.designpatterns.observer.sample1.observer.WxUser;

/**
 * sample1: 微信用户订阅微信公众号, 微信公众号发布文章,通知到每一位用户
 * 观察者:  微信用户  IWXUser
 * 被观察者: 微信公众号  WXPublicObservable
 * 具体的观察者:  具体的某个用户
 * 具体的被观察者: 具体的微信公众号, androidPro 公众号
 *
 *
 * sample3 拉取模式, 微信公众号发布了一遍文章, 用户去主动拉取这一篇文章
 *
 */
public class ObserverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);
    }

    public void click1(View view) {

        // 具体的被观察者,
        WxPublicProObservable wxPublicProObservable = new WxPublicProObservable();


        // 具体的观察者, 微信用户
        WxUser xiaoHong = new WxUser("xiaoHong ");
        WxUser xiaoMing = new WxUser("xiaoMing");


        // 用户订阅公众号
        wxPublicProObservable.register(xiaoHong);
        wxPublicProObservable.register(xiaoMing);

        // 公众号发布文章, 通知所有的用户
        wxPublicProObservable.setArticle("Android Studio 的Logcat用法");
        wxPublicProObservable.setArticle("JAVA WEB开发中显示图片的问题");


        wxPublicProObservable.unRegister(xiaoMing);

        wxPublicProObservable.setArticle("如何重写hashCode()和equals()方法");



    }

    /**
     * 使用java自带的观察者设计模式
     */
    public void click2(View view) {

        example.fangsf.designpatterns.observer.sample2.observer.WxUser wxUser = new example.fangsf.designpatterns.observer.sample2.observer.WxUser("xiaoji");
        example.fangsf.designpatterns.observer.sample2.observer.WxUser wxUser1 = new example.fangsf.designpatterns.observer.sample2.observer.WxUser("xiaozhang");


        example.fangsf.designpatterns.observer.sample2.observable.WxPublicProObservable wxPublicProObservable = new example.fangsf.designpatterns.observer.sample2.observable.WxPublicProObservable();


        // 用户订阅公众号
        wxPublicProObservable.addObserver(wxUser);
        wxPublicProObservable.addObserver(wxUser1);




        // 发布文章, 通知到没一个用户, 也就是没一个观察者
        wxPublicProObservable.setArticle("Android Studio 的Logcat用法");
        wxPublicProObservable.setArticle("JAVA WEB开发中显示图片的问题");



        // 公众号 通知用户发布了文章信息
        wxPublicProObservable.notifyObservers();

    }
}
