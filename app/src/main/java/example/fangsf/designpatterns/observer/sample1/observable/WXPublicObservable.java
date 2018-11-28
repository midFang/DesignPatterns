package example.fangsf.designpatterns.observer.sample1.observable;

import java.util.ArrayList;
import java.util.List;

import example.fangsf.designpatterns.observer.sample1.observer.IWXUser;

/**
 * Created by fangsf on 2018/11/27.
 * Useful:  被观察者: 会被多个人订阅
 * 微信公众号: 对应的是对个用户的关系, 那么我如果在公众号发布了文章, 要通知给没一个用户
 */
public class WXPublicObservable {


    private List<IWXUser> mWXUserList;

    public WXPublicObservable() {
        mWXUserList = new ArrayList<>();
    }


    /**
     * 订阅
     */
    public void register(IWXUser iwxUser) {
        mWXUserList.add(iwxUser);
    }

    /**
     * 取消订阅
     */
    public void unRegister(IWXUser iwxUser) {
        mWXUserList.remove(iwxUser);
    }


    /**
     * 通知更新文章
     */
    public void update(String article) {
        for (IWXUser iwxUser : mWXUserList) {
            iwxUser.push(article);
        }
    }


}
