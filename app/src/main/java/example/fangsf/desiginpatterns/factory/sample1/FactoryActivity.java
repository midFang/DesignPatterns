package example.fangsf.desiginpatterns.factory.sample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import example.fangsf.desiginpatterns.R;


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

    @Override
    public void onClick(View v) {

        String name = SpUtil.getInstance().getString("name");

        mButton.setText(name);

    }

    public void click2(View view) {

        IOHandler ioHandler = IOHandlerFactory.getFactory(IOHandlerFactory.IOType.SP);

        ioHandler.saveString("name", "lisi");

        String name = ioHandler.getString("name");



        ((Button) view).setText(name);


    }

    public void click3(View view) {

        IOHandler factory = IOHandlerFactory.getFactory(IOHandlerFactory.IOType.MEMORY);
        factory.saveString("name", "xiaowu");



        String name = IOHandlerFactory.getFactory(IOHandlerFactory.IOType.MEMORY)
                .getString("name");



        ((Button) view).setText(name);

    }
}
