package example.fangsf.desiginpatterns.factory.sample1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SyncAdapterType;
import android.preference.PreferenceManager;

/**
 * Created by apple on 2018/11/14
 * Useful:
 */
public class SpUtil {

    private static SharedPreferences mSharedPreferences;

    private volatile static SpUtil mInstance;

    public static void init(Context context) {

        mSharedPreferences = context.getApplicationContext().getSharedPreferences("cache", Context.MODE_PRIVATE);


    }


    public void saveString(String key, String value) {
        mSharedPreferences.edit().putString(key, value).apply();
    }

    public String getString(String key) {
        return mSharedPreferences.getString(key, "");
    }


    public static SpUtil getInstance() {
        if (mSharedPreferences == null) {
            throw new NullPointerException(SpUtil.class.getSimpleName() + "请调用init方法");
        }

        if (mInstance == null) {
            synchronized (SpUtil.class) {
                if (mInstance == null) {
                    mInstance = new SpUtil();
                }
            }
        }

        return mInstance;
    }

}
