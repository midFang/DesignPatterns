package example.fangsf.designpatterns.prototype.sample2;

/**
 * Created by fangsf on 2018/12/4.
 * Useful: 箱子规范接口, 通过接口对 对象进行拆分
 */
public interface IBox {

    void setNumber(int number);

    int getNumber();

    /**
     * 增加一个 拆分的方法
     */
    IBox copy();

}
