package example.fangsf.designpatterns.iterator.sample1;

/**
 * Created by apple on 2018/12/5
 * Useful:  qq 的用户系统
 */
public class QQUserSystem {

    User[] mUsers;

    public QQUserSystem(){
        mUsers = new User[2];

        mUsers[0] = new User("zhangsan", "001");
        mUsers[1] = new User("lisi", "002");



    }

    public User[] getUsers() {
        return mUsers;
    }
}
