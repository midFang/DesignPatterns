package example.fangsf.designpatterns.observer.sample3.observable;

import android.net.IpPrefix;

import java.util.ArrayList;
import java.util.List;

import example.fangsf.designpatterns.observer.sample3.observer.IPullWxUser;

/**
 * Created by apple on 2018/11/28
 * Useful: 拉模式, 微信公众号： 多个人去订阅我们的公众
 */
public class WxPullPublicObservable {

    private List<IPullWxUser> mPullWxUsers;

    public WxPullPublicObservable() {
        mPullWxUsers = new ArrayList<>();
    }


    /**
     * 订阅
     */
    public void register(IPullWxUser wxUser) {
        mPullWxUsers.add(wxUser);
    }


    /**
     * 取消订阅
     */
    public void unRegister(IPullWxUser wxUser) {
        mPullWxUsers.remove(wxUser);
    }

    public void update(String article) {
        for (IPullWxUser pullWxUser : mPullWxUsers) {

            // 推送文章更新, this , 当前的公众号
            // 让用户主动去拉取某一篇文章
            pullWxUser.pull(this);
        }
    }


}
