package example.fangsf.designpatterns.iterator.sample2.iterator;

import java.util.List;

import example.fangsf.designpatterns.iterator.sample2.Aggregate;
import example.fangsf.designpatterns.iterator.sample2.User;

/**
 * Created by apple on 2018/12/9
 * Useful:
 */
public class WXIterator implements Iterator<User> {

    private List<User> mUsers;

    private int index;

    public WXIterator(List<User> users) {
        mUsers = users;
    }

    @Override
    public boolean hasNext() {
        return index < mUsers.size();
    }

    @Override
    public User next() {
        return mUsers.get(index++);
    }

}
