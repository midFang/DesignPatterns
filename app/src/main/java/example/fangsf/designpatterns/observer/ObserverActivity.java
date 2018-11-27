package example.fangsf.designpatterns.observer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import example.fangsf.designpatterns.R;

/**
 * sample1: 微信用户订阅微信公众号, 微信公众号发布文章,通知到每一位用户
 * 观察者:  微信用户  IWXUser
 * 被观察者: 微信公众号  WXPublicObservable
 * 具体的观察者:  具体的某个用户
 * 具体的被观察者: 具体的微信公众号, androidPro 公众号
 */
public class ObserverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);
    }
}
