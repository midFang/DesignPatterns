package example.fangsf.designpatterns.iterator.sample3.iterator;

import example.fangsf.designpatterns.iterator.sample3.BottomTabItem;

/**
 * Created by apple on 2018/12/9
 * Useful:
 */
public interface TabIterator {

    BottomTabItem next();

    boolean hasNext();

}
