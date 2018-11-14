package example.fangsf.desiginpatterns.factory.sample1;

import android.util.LruCache;

/**
 * Created by apple on 2018/11/14
 * Useful:
 */
public class IOMemroyHandler implements IOHandler {

    static long maxMemory = Runtime.getRuntime().maxMemory();
    static int max = (int) (maxMemory / 8);

    private static LruCache<String, String> mLruCache = new LruCache<>(max);

    @Override
    public void saveString(String key, String value) {

        mLruCache.put(key, value);

    }

    @Override
    public String getString(String key) {
        return mLruCache.get(key);
    }

}
