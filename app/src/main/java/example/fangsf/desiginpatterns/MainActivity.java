package example.fangsf.desiginpatterns;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import example.fangsf.desiginpatterns.builder.BuilderActivity;
import example.fangsf.desiginpatterns.factory.sample1.FactoryActivity;
import example.fangsf.desiginpatterns.singleton.SingletonActivity;
import example.fangsf.desiginpatterns.template.TemplateActivity;
import example.fangsf.desiginpatterns.wrapper.WrapperActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void singleton1(View view) {
        // 单利设计模式
        startActivity(new Intent(this, SingletonActivity.class));
    }

    public void builderMode(View view) {

        startActivity(new Intent(this, BuilderActivity.class));

    }

    public void factoryMode(View view) {

        startActivity(new Intent(this, FactoryActivity.class));
    }

    public void wrapperPattern(View view) {
        startActivity(new Intent(this, WrapperActivity.class));
    }

    public void temelatePattern(View view) {
        startActivity(new Intent(this, TemplateActivity.class));
    }
}
