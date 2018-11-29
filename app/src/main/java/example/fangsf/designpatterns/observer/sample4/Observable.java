package example.fangsf.designpatterns.observer.sample4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fangsf on 2018/11/29.
 * Useful: 被观察者
 */
public class Observable<U, T extends Observer<U>> {


    private List<T> mObservers;

    public Observable(){
        mObservers = new ArrayList<>();
    }

    public void register(T t){
        mObservers.add(t);
    }

    public void unRegister(T t){
        mObservers.remove(t);
    }


    public void update(U u){
        for (T observer : mObservers) {
            // 通知用户更新数据
            observer.update(u);
        }
    }

}
