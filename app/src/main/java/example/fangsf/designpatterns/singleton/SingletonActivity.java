package example.fangsf.designpatterns.singleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import example.fangsf.designpatterns.R;

public class SingletonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);

        SingleSample1.getInstance().println();


        SingleSample2.getInstance().println();

        singleSample3.getinstance().println();


        SingleSample1 single1 = (SingleSample1) singleSample4.getInstance("single1");
        single1.println();

    }
}
