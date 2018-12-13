package example.fangsf.designpatterns.chainofresponsibility.sample1.handler;

/**
 * Created by fangsf on 2018/12/13.
 * Useful: 抽象处理者接口
 */
public interface IUserSystemHandler<T extends IUserSystemHandler> {

    void nextHandler(T handler); // 形成一条链,

}
