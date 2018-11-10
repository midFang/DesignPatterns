package example.fangsf.desiginpatterns.builder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by apple on 2018/11/10
 * Useful:  基础的navigationBar
 */
public class AbsNavigationBar implements INavigation  {
    private Builder mBuilder;
    private View mNavigationBar;

    public AbsNavigationBar(Builder builder) {
        this.mBuilder = builder;

        createNavigationBar(); //1, 填充ToolBarView, 2, 添加到父布局中 3, 设置参数
    }


    @Override
    public void createNavigationBar() {
        mNavigationBar = LayoutInflater.from(mBuilder.mContext)
                .inflate(mBuilder.mLayoutId, mBuilder.mParentView, false);

        //2,添加到父布局中
        attachParentView(mBuilder.mParentView, mNavigationBar);

        //3,设置参数
        attachParams();

    }



    @Override
    public void attachParams() {

        // 设置文本
        Map<Integer,CharSequence> textMaps = mBuilder.mTextMaps;
        for (Map.Entry<Integer, CharSequence> entry : textMaps.entrySet()) {
            TextView textView = findViewById(entry.getKey());
            textView.setText(entry.getValue());
        }
        // 设置点击事件
        Map<Integer,View.OnClickListener> clickListenerMaps = mBuilder.mClickMaps;
        for (Map.Entry<Integer, View.OnClickListener> entry : clickListenerMaps.entrySet()) {
            View view = findViewById(entry.getKey());
            view.setOnClickListener(entry.getValue());
        }

    }

    public <T extends View> T  findViewById(int viewId) {
        return (T) mNavigationBar.findViewById(viewId);
    }


    @Override
    public void attachParentView(ViewGroup parentView, View navigationBar) {
        parentView.addView(navigationBar, 0);
    }

    // builder 构建类, 主要通过这个类来构建参数的,使用者,通过构建者对象,不需要了解具体内部的实现细节
    public static abstract class Builder<B extends AbsNavigationBar.Builder>{
        private Context mContext;
        private int mLayoutId;
        private ViewGroup mParentView;
        private HashMap<Integer, String > mTextMaps;
        private HashMap<Integer, View.OnClickListener> mClickMaps;


        // 基类的bar, 设置父布局,layout
        public Builder(Context context, int layoutId, ViewGroup parentView) {
            this.mContext = context;
            this.mLayoutId = layoutId;
            this.mParentView = parentView;
            this.mTextMaps = new HashMap<>();
            this.mClickMaps = new HashMap<>();
        }


        /**
         * 通过id, 设置文字
         */
        public B setText(int viewId, String text) {
            mTextMaps.put(viewId, text);
            return (B) this;
        }


        /**
         * 设置点击事件
         */
        public B setOnClickListener(int viewId, View.OnClickListener click) {
            mClickMaps.put(viewId, click);
            return (B) this;
        }


        /**
         * 最后一步构建对象
         * @return
         */
        public abstract AbsNavigationBar create();


    }


}
