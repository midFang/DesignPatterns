package example.fangsf.desiginpatterns.builder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import example.fangsf.desiginpatterns.R;

/**
 * Created by apple on 2018/11/10
 * Useful:  默认样式的navigationBar
 */
public class DefaultNavigationBar extends AbsNavigationBar{

    public DefaultNavigationBar(Builder builder) {
        super(builder);
    }


    public static class Builder extends AbsNavigationBar.Builder<DefaultNavigationBar.Builder> {
        public Builder(Context context, ViewGroup parentView) {
            //        public Builder(Context context, ViewGroup parentView) {
            super(context, R.layout.ui_defualt_navigation_bar, parentView);
        }

        @Override
        public DefaultNavigationBar create() {
            return new DefaultNavigationBar(this);
        }


        public DefaultNavigationBar.Builder setText(String back) {
            setText(R.id.back_tv, back);

            return this;
        }

        public DefaultNavigationBar.Builder setOnClickListener(View.OnClickListener onClickListener) {
            setOnClickListener(R.id.back_tv, onClickListener);

            return this;
        }
    }


}
