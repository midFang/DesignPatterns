package example.fangsf.designpatterns.strategy.sample2;

/**
 * Created by fangsf on 2018/11/21.
 * Useful:
 */
public class WXFinance implements IFinance {


    @Override
    public float finance(int month, int money) {
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
