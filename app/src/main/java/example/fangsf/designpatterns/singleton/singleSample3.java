package example.fangsf.designpatterns.singleton;

/**
 * Created by fangsf on 2018/11/8.
 * Useful:  类似系统服务的单利设计模式, 只要是程序中只有一个实例,那么就是单利设计模式
 */
public class singleSample3 {

    private static singleSample3 mInstance;

    private singleSample3() {
    }

    static {
        mInstance = new singleSample3();
    }

    public static singleSample3 getinstance(){
        return mInstance;
    }

    public void println() {
        System.out.println("singleTonSample4");
    }


}
