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


    /**
     * 这样做的方式, 每次添加新的功能, 都需要在这个改动, 加case判断, 加ioType类型
     * @param IOType
     * @return
     */
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
