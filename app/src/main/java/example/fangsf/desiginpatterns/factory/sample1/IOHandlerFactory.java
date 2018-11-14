package example.fangsf.desiginpatterns.factory.sample1;

/**
 * Created by apple on 2018/11/14
 *
 * 简单工厂模式
 *
 * Useful:  工厂设计模式, 设计模式只是解决某一个特定情况下的应用场景,
 *  * 工厂设计模式: 通过子类构建对象
 */
public class IOHandlerFactory {

    public enum IOType {

        MEMORY, SP

    }


    public static IOHandler getFactory(IOType IOType) {

        switch (IOType) {
            case SP:
                return new IOSPHandler();

            case MEMORY:
                return new IOMemroyHandler();

                default:
                    return null;
        }


    }

}
