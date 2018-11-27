package example.fangsf.designpatterns.wrapper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by apple on 2018/11/17
 * Useful:
 */
public class WrapperRecyclerView extends RecyclerView {

    private WrapperRecyclerAdapter mAdapter;


    public WrapperRecyclerView(@NonNull Context context) {
        super(context);
    }

    public WrapperRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public WrapperRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    //重写adapter
    @Override
    public void setAdapter(@Nullable Adapter adapter) {
        mAdapter = new WrapperRecyclerAdapter(adapter);
        super.setAdapter(mAdapter);  // 使用装饰后的adapter
    }

    /**
     * 添加头部
     *
     * @param view
     */
    public void addHeadView(View view) {
        if (mAdapter != null) {
            mAdapter.addHeadView(view);
        }
    }

    /**
     * 删除头部的view
     *
     * @param view
     */
    public void removeHeadView(View view) {
        if (mAdapter != null) {
            mAdapter.removeHeadView(view);
        }
    }

    /**
     * 删除底部的view
     *
     * @param view
     */
    public void addFooterView(View view) {
        if (mAdapter != null) {
            mAdapter.addFooterView(view);
        }
    }

    /**
     * 删除底部的view
     *
     * @param view
     */
    public void removeFooterView(View view) {
        if (mAdapter != null) {
            mAdapter.removeFooterView(view);
        }
    }


}
