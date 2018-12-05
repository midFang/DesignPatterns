package example.fangsf.designpatterns.iterator.sample1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apple on 2018/12/5
 * Useful:  微信的用户系统: 是list集合的模式
 */
public class WXUserSystem {


    private List<User> mUsers;

    public WXUserSystem() {
        mUsers = new ArrayList<>();
        mUsers.add(new User("zhangsan", "001"));
        mUsers.add(new User("lisi", "002"));

    }

    public List<User> getUsers() {
        return mUsers;
    }
}
