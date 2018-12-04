package example.fangsf.designpatterns.prototype.sample6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import example.fangsf.designpatterns.R;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // 一个参数一个参数的获取
       /* String Params1 = getIntent().getStringExtra("Params1");
        String Params2 = getIntent().getStringExtra("Params2");
        String Params3 = getIntent().getStringExtra("Params3");
        // 又 new 一个 intent

        // 把参数传递
        Intent intent = new Intent(this,Activity3.class);

        intent.putExtra("Params1",Params1);
        intent.putExtra("Params2",Params2);
        intent.putExtra("Params3",Params3);*/


    }

    public void click1(View view) {
        // 原型设计模式（拷贝）
        Intent clone = (Intent) getIntent().clone();
        clone.setClass(this, Activity3.class);
        startActivity(clone);


    }
}
