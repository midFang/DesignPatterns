package example.fangsf.desiginpatterns.strategy.sample2;

/**
 * Created by fangsf on 2018/11/21.
 * Useful: 想对比sample1, 进行了分离, IFinance 接口抽取了出来, 下次如果是新增加了产品,那么直接继承这个接口就可以了
 */
public interface IFinance {

    float finance(int month, int money);

}
