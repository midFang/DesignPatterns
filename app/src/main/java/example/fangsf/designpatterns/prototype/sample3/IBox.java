package example.fangsf.designpatterns.prototype.sample3;

/**
 * Created by fangsf on 2018/12/4.
 * Useful: 箱子规范接口, 使用java 自带的克隆方法
 */
public abstract class IBox implements Cloneable {

    abstract void setNumber(int number);

    abstract int getNumber();

    @Override
    protected IBox clone() throws CloneNotSupportedException {
        return (IBox) super.clone();
    }
}
