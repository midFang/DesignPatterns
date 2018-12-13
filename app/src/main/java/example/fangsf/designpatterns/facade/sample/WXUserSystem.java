package example.fangsf.designpatterns.facade.sample;

import java.util.ArrayList;
import java.util.List;

import example.fangsf.designpatterns.facade.sample.handler.AbsUserSystemHandler;


/**
 * Created by apple on 2018/12/5
 * Useful:  微信的用户系统: 是list集合的模式
 */
public class WXUserSystem extends AbsUserSystemHandler {


    private List<User> mUsers;

    public WXUserSystem() {
        mUsers = new ArrayList<>();
        mUsers.add(new User("zhangsan", "001"));
        mUsers.add(new User("lisi", "002"));

    }

    @Override
    public User queryUserInfo(String userName, String userId) {

        // 查询用户信息
        for (User user : mUsers) {
            if (user.userId.equals(userId) && user.name.equals(userName)) {
                return user;
            }
        }

        // 没有查询到,就交给下一个人处理
        AbsUserSystemHandler nextHandler = getNextHandler();
        if (nextHandler != null) {
            return nextHandler.queryUserInfo(userName, userId);
        }

        return null;
    }
}
