package example.fangsf.designpatterns.chainofresponsibility.sample1;


import example.fangsf.designpatterns.chainofresponsibility.sample1.handler.AbsUserSystemHandler;

/**
 * Created by apple on 2018/12/5
 * Useful:  qq 的用户系统
 */
public class OthersUserSystem extends AbsUserSystemHandler {

    User[] mUsers;

    public OthersUserSystem() {
        mUsers = new User[2];

        mUsers[0] = new User("zhangsan", "001");
        mUsers[1] = new User("lisi", "002");

    }

    @Override
    public User queryUserInfo(String userName, String userId) {


        // 查询信息
        for (User user : mUsers) {
            if (user.name.equals(userName) && user.userId.equals(userId)) {
                return user;
            }
        }

        // 没有查询到信息就交给下一个处理
        AbsUserSystemHandler nextHandler = getNextHandler();
        if (nextHandler != null) {
            return nextHandler.queryUserInfo(userName, userId);
        }


        return null;
    }
}
