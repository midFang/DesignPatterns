package example.fangsf.designpatterns.iterator.sample2.iterator;

/**
 * Created by apple on 2018/12/9
 * Useful:  迭代器,提供数据迭代的一种方式, 不暴露原来对象的内部显示
 */
public interface Iterator<T> {

     boolean hasNext();



    T next();


}
