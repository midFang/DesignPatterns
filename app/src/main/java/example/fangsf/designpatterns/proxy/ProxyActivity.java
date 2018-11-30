package example.fangsf.designpatterns.proxy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import example.fangsf.designpatterns.R;
import example.fangsf.designpatterns.proxy.sample1.BankWorker;
import example.fangsf.designpatterns.proxy.sample1.Man;
import example.fangsf.designpatterns.proxy.sample2.BankInvocationHandler;
import example.fangsf.designpatterns.proxy.sample2.IBank;

/**
 * sample1: 办卡角色划分
 */
public class ProxyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);
    }


    // 静态代理
    public void click1(View view) {

        Man man = new Man("xiaohong");
        BankWorker worker = new BankWorker(man);

        worker.applyBank();
//      worker.saveMoney();  目标接口中, 假如需要新增加业务(存钱), 那么需要代理对象,和被代理对象都需要相应的方法
        // 如果使用动态代理的方式, 那么只需要 被代理人, 也就是办卡人知道有这个业务就可以了


    }

    // 动态代理
    public void click2(View view) {
        // 动态代理, 相当于静态代理, 就是 代理对象转变为动态代理对象的过程

        example.fangsf.designpatterns.proxy.sample2.Man man = new example.fangsf.designpatterns.proxy.sample2.Man("xiaoming");


        // 返回的是 接口的实例对象
        IBank iBank = (IBank) Proxy.newProxyInstance(IBank.class.getClassLoader(),
                new Class[]{IBank.class},
               new BankInvocationHandler(man));



        //办理业务
        iBank.applyBank();


        // 假如银行需要增加一个业务了,  那我只需要通知办卡人有这个业务就可以了, 实现这个接口, 代理对象不需要知道
        iBank.loseBank();

    }


}
