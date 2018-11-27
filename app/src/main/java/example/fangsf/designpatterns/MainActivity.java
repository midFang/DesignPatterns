package example.fangsf.designpatterns;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import example.fangsf.designpatterns.observer.ObserverActivity;
import example.fangsf.designpatterns.strategy.StrategyActivity;
import example.fangsf.designpatterns.adapter.AdapterActivity;
import example.fangsf.designpatterns.builder.BuilderActivity;
import example.fangsf.designpatterns.factory.sample1.FactoryActivity;
import example.fangsf.designpatterns.singleton.SingletonActivity;
import example.fangsf.designpatterns.template.TemplateActivity;
import example.fangsf.designpatterns.wrapper.WrapperActivity;

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

    public void StrategyPattern(View view) {
        startActivity(new Intent(this, StrategyActivity.class));
    }

    public void adapterPattern(View view) {
        startActivity(new Intent(this, AdapterActivity.class));
    }

    public void observerPattern(View view) {
        startActivity(new Intent(this, ObserverActivity.class));
    }
}
