package example.fangsf.designpatterns.factory.sample2;

import example.fangsf.designpatterns.factory.sample1.IOHandler;
import example.fangsf.designpatterns.factory.sample1.IOMemroyHandler;

/**
 * Created by apple on 2018/11/17
 * Useful:
 */
public class IOMemoryFactory implements IFactory {
    @Override
    public IOHandler createHandler() {
        return new IOMemroyHandler();
    }
}
