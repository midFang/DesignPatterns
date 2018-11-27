package example.fangsf.designpatterns.singleton;

import android.app.Activity;

import java.util.Stack;

/**
 * Created by fangsf on 2018/11/8.
 * Useful:  Activity 的管理类
 */
public class AppManager {

    private Stack<Activity> mActivities;
    private static volatile AppManager mInstance;

    private AppManager() {
        mActivities = new Stack<>();
    }

    // DCL
    public static AppManager getInstance() {
        if (mInstance == null) {
            synchronized (AppManager.class) {
                if (mInstance == null) {
                    mInstance = new AppManager();
                }
            }
        }

        return mInstance;
    }

    public void addActivity(Activity attachActivity) {
        mActivities.add(attachActivity);
    }


    public void finishActivity(Activity finishActivity) {
        int size = mActivities.size();
        for (int i = 0; i < size; i++) {
            Activity activity = mActivities.get(i);
            if (activity == finishActivity) {
                mActivities.remove(i);
                activity.finish();
                i--;
                size--;
            }
        }
    }

    public void finishActivity(Class<? extends Activity> activityClass) {
        int size = mActivities.size();
        for (int i = 0; i < size; i++) {
            Activity activity = mActivities.get(i);
            if (activity.getClass().equals(activityClass)) {
                mActivities.remove(i);
                activity.finish();
                i--;
                size--;
            }

        }
    }

    public void finishActivity(){
        Activity activity = mActivities.lastElement();
        finishActivity(activity);
    }

    public void finishAllActivity() {
        int size = mActivities.size();
        for (int i = 0; i < size; i++) {
            mActivities.get(i).finish();
        }

        mActivities.clear();
    }

    public void exitApp() {
        try {
            finishAllActivity();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 从栈中移除activity, 在baseActivity需要单独的从栈中移除,防止内存泄漏
     *
     * @param detachActivity
     */
    public void removeActivity(Activity detachActivity) {
        int size = mActivities.size();
        for (int i = 0; i < size; i++) {  //边循环,边移除, 可能是会不安全的
            Activity activity = mActivities.get(i);
            if (activity == detachActivity) {
                mActivities.remove(i);
                i--;
                size--;
            }
        }
    }

    public Activity getCurrentActivity() {
        return mActivities.lastElement();
    }

}
