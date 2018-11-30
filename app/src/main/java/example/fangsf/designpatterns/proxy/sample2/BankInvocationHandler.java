package example.fangsf.designpatterns.proxy.sample2;

import android.icu.util.EthiopicCalendar;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by fangsf on 2018/11/30.
 * Useful:
 */
public class BankInvocationHandler implements InvocationHandler {

    private Object mObject;

    /**
     * @param object 被代理对象
     */
    public BankInvocationHandler(Object object) {
        this.mObject = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      //  System.out.println("method " + method.getName());

        System.out.println("需要办理什么业务");
        // 反射执行方式
        method.invoke(mObject, args);  // 执行的就是 mObject的方法
        System.out.println("办理完毕");

        return null;
    }
}
