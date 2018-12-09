package example.fangsf.designpatterns.iterator.sample2.iterator;

import android.net.IpSecManager;

import java.util.List;

import example.fangsf.designpatterns.iterator.sample2.User;

/**
 * Created by apple on 2018/12/9
 * Useful:  具体的迭代器
 */
public class QQIterator implements Iterator<User> {

    private User[] mUsers;

    private int index;


    public QQIterator(User[] users) {
        mUsers = users;
    }

    @Override
    public boolean hasNext() {
        return index < mUsers.length; // 是否还有下一个
    }

    @Override
    public User next() {
        return mUsers[index++];  //获取数据
    }
}
