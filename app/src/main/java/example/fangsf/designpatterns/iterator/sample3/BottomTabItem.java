package example.fangsf.designpatterns.iterator.sample3;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by apple on 2018/12/9
 * Useful:  底部的bottomItem的基类
 */
public abstract class BottomTabItem {

    // 构造出底部的context , layout布局
    private int mLayoutId;
    private Context mContext;

    // 底部的view
    private View mTabItemView;


    public BottomTabItem(int layoutId, Context context) {
        mLayoutId = layoutId;
        mContext = context;
    }


    public View getTabView() {

        if (mTabItemView == null) {
            // 加载布局
            mTabItemView = LayoutInflater.from(mContext)
                    .inflate(mLayoutId, null);

            // 初始化布局的显示
            initLayout();

        }


        return mTabItemView;
    }

    public <T> T findViewById(int resId) {
        return (T) mTabItemView.findViewById(resId);
    }

    protected abstract void initLayout();


    /**
     * 是否选中当前的条目
     * @param selected
     */
    public abstract void setSelected(boolean selected);


}
