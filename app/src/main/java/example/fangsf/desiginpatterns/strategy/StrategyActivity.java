package example.fangsf.desiginpatterns.strategy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import example.fangsf.desiginpatterns.R;
import example.fangsf.desiginpatterns.strategy.sample1.FinanceManager;
import example.fangsf.desiginpatterns.strategy.sample2.AliFinance;
import example.fangsf.desiginpatterns.strategy.sample2.IFinance;
import example.fangsf.desiginpatterns.strategy.sample2.WXFinance;


/**
 * 策略设计模式:策略模式定义了一系列的算法，并将每一个算法封装起来，而且使他们可以相互替换，让算法独立于使用它的客户而独立变化
 *
 * 策略模式定义和封装了一系列的算法，它们是可以相互替换的，也就是说它们具有共性，而它们的共性就体现在策略接口的行为上，
 * 另外为了达到最后一句话的目的，也就是说让算法独立于使用它的客户而独立变化，我们需要让客户端依赖于策略接口
 */
public class StrategyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy);
    }

    public void click1(View view) {

        float aliFinance = FinanceManager.AliFinance(3, 10000);

        System.out.println("sample1 ali " + aliFinance);

        float wxFinance = FinanceManager.WXFinance(3, 10000);

        System.out.println("sample1 wx " + wxFinance);

    }

    public void click2(View view) {

        // 这样的方式和 工厂设计模式(通过子类构建对象)有点像
        IFinance aLiFinance = new AliFinance();
        float aliFinance = aLiFinance.finance(3, 10000);

        System.out.println("sample2 ali " + aliFinance);

        IFinance wxFinance = new WXFinance();
        float wxFinances = wxFinance.finance(3, 10000);

        System.out.println("sample2 wx " + wxFinances);

    }
}
