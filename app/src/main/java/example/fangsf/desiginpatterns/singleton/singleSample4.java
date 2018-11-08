package example.fangsf.desiginpatterns.singleton;

import java.lang.invoke.MethodHandle;
import java.util.HashMap;

/**
 * Created by fangsf on 2018/11/8.
 * Useful:  类似系统服务的单利设计模式, 只要是程序中只有一个实例,那么就是单利设计模式
 */
public class singleSample4 {

    private static HashMap<String, Object> mHashMap = new HashMap<>();


    static {
        mHashMap.put("single1", SingleSample1.getInstance());
        mHashMap.put("single2", SingleSample2.getInstance());
    }


    public static Object getInstance(String keyName){
        return mHashMap.get(keyName);
    }


}
