package example.fangsf.designpatterns.iterator.sample2;


import example.fangsf.designpatterns.iterator.sample2.iterator.Iterator;
import example.fangsf.designpatterns.iterator.sample2.iterator.QQIterator;

/**
 * Created by apple on 2018/12/5
 * Useful:  qq 的用户系统
 */
public class QQUserSystem implements Aggregate<User>{

    User[] mUsers;

    public QQUserSystem(){
        mUsers = new User[2];

        mUsers[0] = new User("zhangsan", "001");
        mUsers[1] = new User("lisi", "002");

    }

    @Override
    public Iterator<User> iterator() {
        return new QQIterator(mUsers);
    }
}
