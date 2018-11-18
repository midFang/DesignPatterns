package example.fangsf.desiginpatterns.wrapper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import example.fangsf.desiginpatterns.R;


/**
 * 装饰设计
 */
public class WrapperActivity extends AppCompatActivity {

    private WrapperRecyclerView mRecyclerView;
    private List<String> mItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrapper);

        mRecyclerView = findViewById(R.id.rc_view);


        mItems = new ArrayList<>();
        for (int i = 0; i < 99; i++) {
            mItems.add("text " + i);
        }


        RealAdapter realAdapter = new RealAdapter(this, mItems);
//
//        //进行装饰, 使用构造的方式进行扩展,不使用继承的方式
        WrapperRecyclerAdapter wrapperRecyclerAdapter = new WrapperRecyclerAdapter(realAdapter);
//
//
//
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        mRecyclerView.setAdapter(wrapperRecyclerAdapter);
//
//        View view = LayoutInflater.from(this)
//                .inflate(R.layout.layout_head_view, mRecyclerView,false);
//
//        wrapperRecyclerAdapter.addHeadView(view);
//        wrapperRecyclerAdapter.addFooterView(view);



        // 封装在recyclerView 中去
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(realAdapter);
        View view = LayoutInflater.from(this)
                .inflate(R.layout.layout_head_view, mRecyclerView, false);

        mRecyclerView.addHeadView(view);
        mRecyclerView.addFooterView(view);


    }
}
