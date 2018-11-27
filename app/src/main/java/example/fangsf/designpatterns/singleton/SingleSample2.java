package example.fangsf.designpatterns.singleton;

/**
 * Created by fangsf on 2018/11/8.
 * Useful: 单利设计模式,懒汉式
 */
public class SingleSample2 {


    /**
     * volatile 1, 防止java的重排序的问题, 2, 对线程的可见性(线程访问,线程修改的可见性)
     */
    private volatile static SingleSample2 mInstance;

    /**
     * 1, 对象的创建的时序问题,  SingleSample2  mInstance = new SingleSample2();
     *          1, 在内存中申请分配一块内存空间  (正常情况)
     *          2, 初始化对象
     *          3, 给变量赋值, (指向一块内存地址)
     *
     *
     * 2, 可能会发生第二种情况,时序问题
     *          1, 在内存中申请分配一块内存空间
     *          2, 给变量赋值, (指向一块内存地址) //在访问getInstance() 的时候, 由于这里已经指向了一块内存地址,就不为null了,就返回对象,但是他其实没有值的,就会发生问题了
     *          3, 初始化对象
     *
     */


    /**
     * 对线程的可见性(线程访问,线程修改的可见性)
     *
     * 在多线程的操作的情况下, 可能线程1,对对象进行了修改,或者是赋值, 但是对象是线程不可见了, 线程2访问的时候,可能并不知情,可能再次进行修改,或者赋值对象,会发生错误
     */

    private SingleSample2() {
    }


    // DCL 双重检测机制, 主要是在多线程的情况下, 获取实例对象的情况下, 高效率
    public static SingleSample2 getInstance() {

        if (mInstance == null) {
            synchronized (SingleSample2.class) {
                if (mInstance == null) {
                    mInstance = new SingleSample2();
                }
            }
        }

        return mInstance;
    }


    public void println() {
        System.out.println("懒汉式单利设计模式");
    }


}
