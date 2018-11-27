package example.fangsf.designpatterns.adapter.sample2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/**
 * Created by apple on 2018/11/24
 * Useful: 对象适配器模式,   简单的listview 的适配器模式demo
 */
public class ListView  extends ScrollView {

    private LinearLayout mContainer;

    // 对象适配器模式, 最直接的体现类型就是, 将被适配的对象,传递进来, 而不是通过继承的方式进行适配
    private ListAdapter mAdapter;


    public ListView(Context context) {
        this(context, null);
    }

    public ListView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mContainer = new LinearLayout(context);
        mContainer.setOrientation(LinearLayout.VERTICAL);
        addView(mContainer,0);
    }


    @Override
    public void addView(View child) {
        mContainer.addView(child);
    }

    public void setAdapter( ListAdapter adapter){
        mAdapter = adapter;


        int count = mAdapter.getCount();
        for (int i = 0; i < count; i++) {
            View view = mAdapter.getView(i, mContainer);
            addView(view);  // 转换成我们需要的view
        }
    }


}
