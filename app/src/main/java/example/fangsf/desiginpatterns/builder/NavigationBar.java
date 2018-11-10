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
            // 基类create的对象应该是NavigationBar,所以使用builder构建对象应该也是属于NavigationBar的,需要使用泛型限定
            return new NavigationBar(this);  //调用super,基类,创建
        }
    }


}
