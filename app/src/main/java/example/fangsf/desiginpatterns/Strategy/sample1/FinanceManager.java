package example.fangsf.desiginpatterns.Strategy.sample1;

/**
 * Created by fangsf on 2018/11/21.
 * Useful: 金融理财的小案例, 假设阿里和微信的理财, 本金加利息的方式如下
 *
 * 缺点: 每次增加新的产品都需要改动这里的代码, 应该尽量抽取公用部分,进行分离
 */
public class FinanceManager {

    // 阿里 理财
    public static float AliFinance(int month, int money) {
        if (month == 3) {
            return money + (money * (month / 12f) * 0.03f);
        }

        if (month == 6) {
            return money + (money * (month / 12f) * 0.33f);
        }

        if (month == 12) {
            return money + (money * (month / 12f) * 0.53f);
        }

        throw new IllegalArgumentException("month is error");
    }


    // 微信理财
    public static float WXFinance(int month, int money) {
        if (month == 3) {
            return money + (money * (month / 12f) * 0.05f);
        }

        if (month == 6) {
            return money + (money * (month / 12f) * 0.37f);
        }

        if (month == 12) {
            return money + (money * (month / 12f) * 0.68f);
        }


        throw new IllegalArgumentException("month is error");
    }

}
