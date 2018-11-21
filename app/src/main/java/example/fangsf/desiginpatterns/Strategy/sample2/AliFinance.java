package example.fangsf.desiginpatterns.Strategy.sample2;

/**
 * Created by fangsf on 2018/11/21.
 * Useful:
 */
public class AliFinance implements IFinance {

    @Override
    public float finance(int month, int money) {
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
}
