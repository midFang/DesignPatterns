package example.fangsf.designpatterns.observer.sample4;

import java.net.DatagramPacket;
import java.util.List;

/**
 * Created by fangsf on 2018/11/29.
 * Useful:  数据的更新
 */
public class DataBaseManager {

    private static volatile  DataBaseManager mInstance;

    private Observable<User, Observer<User>> mObservable;

    private DataBaseManager(){
        mObservable = new Observable<>();
    }

    public static DataBaseManager getInstance(){
        if (mInstance == null) {
            synchronized (DataBaseManager.class){
                if (mInstance == null) {
                    mInstance = new DataBaseManager();
                }
            }
        }

        return mInstance;
    }

    /**
     * 订阅事件
     * @param userObserver
     */
    public void register(Observer<User> userObserver){
        mObservable.register(userObserver);
    }

    /**
     * 更新数据
     * @param user
     */
    public void insert(User user){
        mObservable.update(user);
    }

}
