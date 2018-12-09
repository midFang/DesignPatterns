package example.fangsf.designpatterns.iterator.sample3.iterator;

import java.util.ArrayList;
import java.util.List;

import example.fangsf.designpatterns.iterator.sample3.BottomTabItem;

/**
 * Created by apple on 2018/12/9
 * Useful:  具体的列表的底部迭代器
 */
public class TabListIterator<T extends BottomTabItem> implements TabIterator {

    private List<T> mTabItems;

    private int index;

    public TabListIterator() {
        mTabItems = new ArrayList<>();
    }

    public void addItem(T tabItem) {
        mTabItems.add(tabItem);
    }

    @Override
    public BottomTabItem next() {
        return mTabItems.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < mTabItems.size();
    }

}
