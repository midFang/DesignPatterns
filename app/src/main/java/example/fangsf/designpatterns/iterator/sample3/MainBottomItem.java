package example.fangsf.designpatterns.iterator.sample3;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

import example.fangsf.designpatterns.R;

/**
 * Created by apple on 2018/12/9
 * Useful:
 */
public class MainBottomItem extends BottomTabItem {


    private Builder mBuilder;

    public MainBottomItem(Context context) {
        super(R.layout.tab_main_bottom_item, context);
    }

    public MainBottomItem(Builder builder) {
        this(builder.mContext);
        this.mBuilder = builder;
    }


    @Override
    protected void initLayout() {


        //  设置布局的显示
        TextView tabText = findViewById(R.id.tab_text);
        ImageView tabIcon = findViewById(R.id.tab_icon);

        if (!TextUtils.isEmpty(mBuilder.mText)) {
            tabText.setText(mBuilder.mText);
        }

        if (mBuilder.mResId != 0) {
            tabIcon.setImageResource(mBuilder.mResId);
        }

    }

    @Override
    public void setSelected(boolean selected) {

        TextView tabText = findViewById(R.id.tab_text);
        ImageView tabIcon = findViewById(R.id.tab_icon);

        tabText.setSelected(selected);
        tabIcon.setSelected(selected);

    }


    /**
     * 使用builder 设计模式去构建出这个对象
     */
    public static class Builder {
        private Context mContext;
        private String mText;
        private int mResId;

        public Builder(Context context) {
            this.mContext = context;
        }

        public Builder text(String text) {
            this.mText = text;
            return this;
        }

        public Builder resIcon(int resId) {
            this.mResId = resId;
            return this;
        }


        public MainBottomItem create() {
            return new MainBottomItem(this);
        }

    }


}
