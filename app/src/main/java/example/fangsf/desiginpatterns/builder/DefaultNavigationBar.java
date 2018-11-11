package example.fangsf.desiginpatterns.builder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import example.fangsf.desiginpatterns.R;

/**
 * Created by apple on 2018/11/10
 * Useful:  默认样式的navigationBar
 */
public class DefaultNavigationBar extends AbsNavigationBar<DefaultNavigationBar.Builder> {

    public DefaultNavigationBar(Builder builder) {
        super(builder);
    }

    @Override
    public void attachParentView(ViewGroup parentView, View navigationBar) {
        super.attachParentView(parentView, navigationBar);

        // 设置默认的样式
        TextView leftText = findViewById(R.id.back_tv);
        leftText.setVisibility(getBuilder().mLeftTextVisible);

    }

    public static class Builder extends AbsNavigationBar.Builder<DefaultNavigationBar.Builder> {

        public int mLeftTextVisible = View.VISIBLE;

        public Builder(Context context, ViewGroup parentView) {
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

        public DefaultNavigationBar.Builder setLeftTextVisible(int invisible) {
            // 默认是先构建参数, 然后会再调用create 方法,创建对象,然后调用了 attachParentView 方法
            mLeftTextVisible = invisible;
            return this;
        }
    }


}
