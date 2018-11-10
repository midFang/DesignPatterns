package example.fangsf.desiginpatterns.builder;

import android.content.Context;
import android.view.ViewGroup;

/**
 * Created by apple on 2018/11/10
 * Useful:
 */
public class NavigationBar extends AbsNavigationBar{


    public NavigationBar(Builder builder) {
        super(builder);
    }


    public static class Builder extends AbsNavigationBar.Builder<NavigationBar.Builder>{

        public Builder(Context context, int layoutId, ViewGroup parentView) {
            super(context, layoutId, parentView);
        }

        @Override
        public NavigationBar create() {
            return new NavigationBar(this);  //调用super,基类,创建
        }
    }


}
