package example.fangsf.designpatterns.iterator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import example.fangsf.designpatterns.R;


/**
 * 迭代器设计模式: 提供一种方法顺序访问容器中的各个元素,而又不暴露该对象的内部显示
 * <p>
 * 微信登录例子:  微信登录的时候, 可以是qq账号 ,也可以是微信账号
 */
public class IteratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iterator);
    }

    public void click1(View view) {

        startActivity(new Intent(this, BottomTabActivity.class));

    }
}
