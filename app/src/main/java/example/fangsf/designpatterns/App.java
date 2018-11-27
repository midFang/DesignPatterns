package example.fangsf.designpatterns;

import android.app.Application;

import example.fangsf.designpatterns.factory.sample1.SpUtil;

/**
 * Created by apple on 2018/11/14
 * Useful:
 */
public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();


        SpUtil.init(this);

    }
}
