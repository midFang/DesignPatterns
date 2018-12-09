package example.fangsf.designpatterns.iterator.sample2;

import java.util.ArrayList;
import java.util.List;

import example.fangsf.designpatterns.iterator.sample2.iterator.Iterator;
import example.fangsf.designpatterns.iterator.sample2.iterator.WXIterator;


/**
 * Created by apple on 2018/12/5
 * Useful:  微信的用户系统: 是list集合的模式
 */
public class WXUserSystem implements Aggregate<User>{


    private List<User> mUsers;

    public WXUserSystem() {
        mUsers = new ArrayList<>();
        mUsers.add(new User("zhangsan", "001"));
        mUsers.add(new User("lisi", "002"));

    }

    @Override
    public Iterator<User> iterator() {
        return new WXIterator(mUsers);
    }

}
