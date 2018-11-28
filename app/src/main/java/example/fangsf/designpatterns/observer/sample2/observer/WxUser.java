package example.fangsf.designpatterns.observer.sample2.observer;

import java.util.Observable;
import java.util.Observer;

import example.fangsf.designpatterns.observer.sample1.observer.IWXUser;

/**
 * Created by apple on 2018/11/28
 * Useful:  WxUser 具体的微信用户
 */
public class WxUser implements Observer {


    private String name;

    public WxUser(String name) {
        this.name = name;
    }



    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + " 收到了一篇文章 " + arg);
    }
}
