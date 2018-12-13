package example.fangsf.designpatterns.chainofresponsibility.sample1.handler;

/**
 * Created by fangsf on 2018/12/13.
 * Useful:  抽象处理者角色
 */
public abstract class AbsUserSystemHandler implements IUserSystemHandler<AbsUserSystemHandler>, IUserSystem {

//    @Override
//    public User queryUserInfo(String userName, String userId) {
//        return null;
//    }


    private AbsUserSystemHandler mAbsUserSystemHandler;

    public AbsUserSystemHandler getNextHandler() {
        return mAbsUserSystemHandler;
    }

    @Override
    public void nextHandler(AbsUserSystemHandler handler) {
        mAbsUserSystemHandler = handler;
    }
}
