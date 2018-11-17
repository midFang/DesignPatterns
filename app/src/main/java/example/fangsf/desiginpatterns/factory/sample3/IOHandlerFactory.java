package example.fangsf.desiginpatterns.factory.sample3;

import java.util.logging.MemoryHandler;

import example.fangsf.desiginpatterns.factory.sample1.IOHandler;
import example.fangsf.desiginpatterns.factory.sample1.IOMemroyHandler;
import example.fangsf.desiginpatterns.factory.sample1.IOSPHandler;

/**
 * Created by apple on 2018/11/17
 * Useful:  抽象工厂方式,工程设计模式就是用来生成对象的, 将对象的实例化和初始化封装起来,让使用者构建更加简单,扩展性更强
 */
public class IOHandlerFactory {

    private static volatile IOHandlerFactory mInstance;
    private IOHandler mIOSPHandler;
    private IOHandler mIOMemroyHandler;

    private IOHandlerFactory() {
    }

    public static IOHandlerFactory getInstance() {
        if (mInstance == null) {
            synchronized (IOHandlerFactory.class) {
                if (mInstance == null) {
                    mInstance = new IOHandlerFactory();
                }
            }
        }

        return mInstance;
    }

    private IOHandler createIOHandler(Class<? extends IOHandler> ioHandlerClass) {


        try {
            return ioHandlerClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }


        return getSpIoHandler();  //默认的存储方式
    }


    /**
     * 扩展性更强, 如果要新增加的话, 再添加一个方法就可以了
     * sp的存储方式
     *
     * @return
     */
    public IOHandler getSpIoHandler() {
        if (mIOSPHandler == null) {
            mIOSPHandler = createIOHandler(IOSPHandler.class);
        }

        return mIOSPHandler;
    }


    /**
     * 内存的存储方式
     */
    public IOHandler getMemoryHandler() {
        if (mIOMemroyHandler == null) {
            mIOMemroyHandler = createIOHandler(IOMemroyHandler.class);
        }
        return mIOMemroyHandler;
    }


}
