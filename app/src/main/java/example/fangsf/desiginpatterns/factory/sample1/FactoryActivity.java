package example.fangsf.desiginpatterns.factory.sample1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import example.fangsf.desiginpatterns.R;
import example.fangsf.desiginpatterns.factory.sample2.IFactory;
import example.fangsf.desiginpatterns.factory.sample2.IOMemoryFactory;
import example.fangsf.desiginpatterns.factory.sample2.IOSPFactory;


/**
 * 工厂设计模式, 设计模式只是解决某一个特定情况下的应用场景,
 * 工厂设计模式: 通过子类构建对象
 */
public class FactoryActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);

        mButton = findViewById(R.id.btn);

        SpUtil.getInstance().saveString("name", "zhangsan");

        mButton.setOnClickListener(this);

    }


    //简单工厂, 每次需要加判断case, 还需要加入ioType类型的判断
    @Override
    public void onClick(View v) {


        IOHandler ioHandler = example.fangsf.desiginpatterns.factory.sample1.IOHandlerFactory.getFactory(IOHandlerFactory.IOType.SP);

        ioHandler.saveString("name", "简单工厂");

        String name = ioHandler.getString("name");

        ((Button) v).setText(name);

    }


    /**
     * 工厂方法模式 , 每次新增加功能, 都需要多增加一个类, 但是不用修改原有的类的, 开闭原则,
     *
     * @param view
     */
    public void click2(View view) {

        IFactory iFactory = new IOMemoryFactory();
        IOHandler ioHandler = iFactory.createHandler();
        ioHandler.saveString("key", "工厂方法模式");

        IFactory factory = new IOSPFactory();
        IOHandler handler = factory.createHandler();
        handler.saveString("key", "工厂方法模式");

        Toast.makeText(this, "" + handler.getString("key"), Toast.LENGTH_SHORT).show();


        ((Button) view).setText(ioHandler.getString("key"));


    }

    /**
     * 抽象工厂模式
     *
     * @param view
     */
    public void click3(View view) {

        example.fangsf.desiginpatterns.factory.sample3.IOHandlerFactory instance = example.fangsf.desiginpatterns.factory.sample3.IOHandlerFactory.getInstance();

        instance.getSpIoHandler().saveString("key", "抽象工厂模式");

        ((Button) view).setText(instance.getInstance().getSpIoHandler().getString("key"));


    }

}
