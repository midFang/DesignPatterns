package example.fangsf.desiginpatterns.singleton;

/**
 * Created by fangsf on 2018/11/8.
 * Useful:  第一种单利设计模式, 饿汉式
 */
public class SingleSample1 {

    private static SingleSample1 mInstance = new SingleSample1();

    // 1, 构造方法私有化, 防止外部创建对象
    private SingleSample1(){}


    public static SingleSample1 getInstance() {
        return mInstance;
    }

    public void println() {
        System.out.println("饿汉式设计模式");
    }

}
