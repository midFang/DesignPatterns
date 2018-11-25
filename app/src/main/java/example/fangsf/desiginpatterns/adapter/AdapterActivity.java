package example.fangsf.desiginpatterns.adapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import example.fangsf.desiginpatterns.R;
import example.fangsf.desiginpatterns.adapter.sample1.IUSDAdapter;
import example.fangsf.desiginpatterns.adapter.sample1.RMBAdapter;
import example.fangsf.desiginpatterns.adapter.sample1.USDAdapter;
import example.fangsf.desiginpatterns.adapter.sample2.ListAdapter;
import example.fangsf.desiginpatterns.adapter.sample2.ListView;

public class AdapterActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        mListView = findViewById(R.id.lv);

        final List<String> mList = new ArrayList<>();

        //假设这个是服务器给我们返回的数据,
        // 但是我们的listview, 需要的只是一个view, 并不是一个列表, 所以我们需要适配这个对象
        for (int i = 0; i < 50; i++) {
            mList.add("" + i);
        }


        mListView.setAdapter(new ListAdapter(mList, this));




    }

    public void click1(View view) {

        RMBAdapter rmbAdapter = new RMBAdapter(5000);

        float rmb = rmbAdapter.getRmb();
        float usd = rmbAdapter.getUSD();

        System.out.println("rmb = " + rmb + " usd = " + usd);


        // 适配器有两种方式, 一种是类适配,一种是对象适配, 这里的rmbAdapter, 需求需要一个美元的金额显示,
        // 但是这里是人民币处理的类, 这里对这个类进行适配, 就出现了UsdAdapter

        IUSDAdapter iusdAdapter = new USDAdapter(500);
        float usd1 = iusdAdapter.getUSD();

        System.out.println(" usd 1 " + usd1);


    }
}
