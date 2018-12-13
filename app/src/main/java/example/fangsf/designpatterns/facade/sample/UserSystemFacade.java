package example.fangsf.designpatterns.facade.sample;

import example.fangsf.designpatterns.facade.sample.handler.AbsUserSystemHandler;
import example.fangsf.designpatterns.facade.sample.handler.IUserSystem;

/**
 * Created by fangsf on 2018/12/13.
 * Useful:
 */
public class UserSystemFacade implements IUserSystem {

    private AbsUserSystemHandler mUserSystemHandler;

    public UserSystemFacade() {
        mUserSystemHandler = new WXUserSystem();
        QQUserSystem qqUserSystem = new QQUserSystem();
        OthersUserSystem othersUserSystem = new OthersUserSystem();

        // 责任链
        mUserSystemHandler.nextHandler(qqUserSystem);
        qqUserSystem.nextHandler(othersUserSystem);

    }


    @Override
    public User queryUserInfo(String userName, String userId) {
        return mUserSystemHandler.queryUserInfo(userName, userId);
    }
}
