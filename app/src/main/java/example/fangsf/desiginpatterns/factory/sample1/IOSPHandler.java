package example.fangsf.desiginpatterns.factory.sample1;

import java.security.interfaces.ECKey;

/**
 * Created by apple on 2018/11/14
 * Useful:
 */
public class IOSPHandler implements IOHandler {


    @Override
    public void saveString(String key, String value) {
        SpUtil.getInstance().saveString(key,value);
    }



    @Override
    public String getString(String key) {
        return SpUtil.getInstance().getString(key);
    }
}
