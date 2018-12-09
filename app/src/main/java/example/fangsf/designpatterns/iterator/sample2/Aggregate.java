package example.fangsf.designpatterns.iterator.sample2;

import example.fangsf.designpatterns.iterator.sample2.iterator.Iterator;

/**
 * Created by apple on 2018/12/9
 * Useful:  容器的接口,  由于qq系统和微信系统提供的数据都是不一样的, aggregate 类似中间人一样, 协调作用
 */
public interface Aggregate<T> {


    Iterator<T> iterator();


}
