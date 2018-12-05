package example.fangsf.designpatterns.iterator.sample1;

import android.widget.Toast;

/**
 * Created by apple on 2018/12/5
 * Useful:
 */
public class Client {

    public static void main(String[] args){


        // 做登录的操作

        // 先去qq系统里面查找, 是否存在这个用户, 如果不存在, 那么再去微信系统里面查找

        // qq 和 微信 系统, 分别对应着不同的数据结构(比如qq是集合,微信是数组)

        // 这里就会发现问题了, 那么如果我后面,又增加了一个系统, 那么又要在这里写代码, 扩展性不高, 写的代码很多


        User user = searchByQQSystem("zhangsan", "001");

        if (user == null) {
            // 在qq系统中, 没有找到这个用户
            // 那么要在微信系统中找到这个应用
            User wxSystemUser = searchByWXSystem("zhangsan", "001");

            if (wxSystemUser == null) {
                System.out.println("用户不存在");
            }

        }

        // 假如这里后期又增加了一个系统, 那么, 这里需要向上面一样, 写重复的代码

    }

    private static User searchByWXSystem(String name, String userId) {
        WXUserSystem wxUserSystem = new WXUserSystem();

        for (int i = 0; i < wxUserSystem.getUsers().size(); i++) {
            User user = wxUserSystem.getUsers().get(i);

            if (userId.equals(user.userId) && name.equals(user.name)) {
                // 查找到了这个用户
                return user;
            }

        }

        return null;
    }

    private static User searchByQQSystem(String name, String userId) {
        QQUserSystem qqUserSystem = new QQUserSystem();

        for (int i = 0; i < qqUserSystem.getUsers().length; i++) {
            User[] users = qqUserSystem.getUsers();

            if (userId.equals(users[i].userId) && name.equals(users[i].name)) {
                // 查找到了这个用户
                return users[i];
            }

        }

        return null;
    }

}
