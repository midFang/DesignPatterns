package example.fangsf.designpatterns.prototype.sample6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import example.fangsf.designpatterns.R;
import example.fangsf.designpatterns.proxy.ProxyActivity;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
    }

    public void click1(View view) {
        Intent intent = new Intent(this, Activity2.class);
        // intent 传递参数, 也是一种原型设计模式
        intent.putExtra("params1", "params1");
        intent.putExtra("params2", "params2");
        intent.putExtra("params3", "params3");

        startActivity(intent);

        /**
         *         ArrayList<String> list = new ArrayList<>();
         *         // 有很多数据  (是一个固定的原型)
         *         ArrayList<String> copyList = (ArrayList<String>) list.clone();
         *
         *         // OkHttp 的源码，它是没用系统的，但是类似，如果自己写是可以用系统的
         *         OkHttpClient client = new OkHttpClient();
         *
         *         client.newBuilder();
         */
    }
}
