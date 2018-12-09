package example.fangsf.designpatterns.iterator.sample3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import example.fangsf.designpatterns.R;
import example.fangsf.designpatterns.iterator.sample3.iterator.TabIterator;

/**
 * Created by apple on 2018/12/9
 * Useful:
 */
public class TabBottomNavigation extends LinearLayout {

    // 底部的view
    private List<BottomTabItem> mBottomTabItems;

    private int mCurrentIndex = -1;
    private Context mContext;

    public TabBottomNavigation(Context context) {
        this(context, null);
    }

    public TabBottomNavigation(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TabBottomNavigation(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;


        setOrientation(HORIZONTAL);

        mBottomTabItems = new ArrayList<>();


    }

    public void addTabItem(TabIterator tabIterator) {


        mBottomTabItems.clear();
        int index = 0;
        while (tabIterator.hasNext()) {

            BottomTabItem tabItem = tabIterator.next();

            View tabView = tabItem.getTabView();

            addView(tabView);
            int childCount = TabBottomNavigation.this.getChildCount();
            System.out.println(childCount);

            LinearLayout.LayoutParams params = (LayoutParams) tabView.getLayoutParams();
            params.weight = 1;
            params.gravity = Gravity.CENTER;
            tabView.setLayoutParams(params);

            setItemOnClickListener(tabView, index++);
            mBottomTabItems.add(tabItem);


        }

        // 默认是选中第一个条目
        mBottomTabItems.get(0).setSelected(true);
        mCurrentIndex = 0;

    }

    private void setItemOnClickListener(final View tabView, final int position) {

        tabView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCurrentIndex != position) {

                    // 上一个设置未选中,当前的设置为选中的
                    mBottomTabItems.get(mCurrentIndex).setSelected(false);
                    mBottomTabItems.get(position).setSelected(true);

                    mCurrentIndex = position;

                }
            }
        });

    }


}
