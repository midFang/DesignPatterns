package example.fangsf.desiginpatterns.wrapper;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by apple on 2018/11/17
 * Useful:  装饰者设计模式, 扩展添加头部和底部
 * 这个adapter是包含了头部和底部的adapter
 */
public class WrapperRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    // 需要对原来有的adapter进行装饰, 一般是通过构造函数进行扩展的
    private RealAdapter mRealAdapter;
    //头部和底部的view(参考HeaderViewListAdapter)
    private ArrayList<View> mHeaderViews;
    private ArrayList<View> mFooterViews;


    public WrapperRecyclerAdapter(RealAdapter realAdapter) {
        mRealAdapter = realAdapter;


        mRealAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
            @Override
            public void onChanged() {
                super.onChanged();
                notifyDataSetChanged();
            }
        });

        mHeaderViews = new ArrayList<>();
        mFooterViews = new ArrayList<>();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) { //这里接收的是位置
        // 具体的位置, 判断具体的viewHolder

        // Header (negative positions will throw an IndexOutOfBoundsException)
        int numHeaders = getHeadersCount();//头部的位置
        if (position < numHeaders) {
            return new createFooterViewHolder(mHeaderViews.get(position));
        }

        // Adapter
        final int adjPosition = position - numHeaders; //除去头部的位置
        int adapterCount = 0;
        if (mRealAdapter != null) {
            adapterCount = mRealAdapter.getItemCount();
            if (adjPosition < adapterCount) {
                //mRealAdapter.getItemViewType(position), 兼容多布局的view
                return mRealAdapter.onCreateViewHolder(parent, mRealAdapter.getItemViewType(position));
            }
        }

        // Footer (off-limits positions will throw an IndexOutOfBoundsException)
        return new createFooterViewHolder(mFooterViews.get(adjPosition - adapterCount));//返回底部的viewHolder
    }

    public int getHeadersCount() {
        return mHeaderViews.size();
    }


    @Override
    public int getItemViewType(int position) {
        return position; //直接将position位置返回
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {


        // 调用realAdapter的onBindViewHolder
        int numHeaders = getHeadersCount();
        if (position < numHeaders) {
            return ;
        }
        // Adapter
        final int adjPosition = position - numHeaders;
        int adapterCount = 0;
        if (mRealAdapter != null) {
            adapterCount = mRealAdapter.getItemCount();
            if (adjPosition < adapterCount) {
                //mRealAdapter.getItemViewType(position), 兼容多布局的view
                 mRealAdapter.onBindViewHolder((RealAdapter.ViewHolder) viewHolder, position);
            }
        }


    }

    @Override
    public int getItemCount() { // mRealAdapter原来的大小 + 头部的view + 底部的view
        return mRealAdapter.getItemCount() + mHeaderViews.size() + mHeaderViews.size();
    }


    /**
     * 添加头部
     *
     * @param view
     */
    public void addHeadView(View view) {
        if (mRealAdapter != null) {
            if (!mHeaderViews.contains(view)) {
                mHeaderViews.add(view);
            }

            notifyDataSetChanged();
        }
    }

    /**
     * 删除头部的view
     *
     * @param view
     */
    public void removeHeadView(View view) {
        if (mRealAdapter != null) {
            if (mHeaderViews.contains(view)) {
                mHeaderViews.remove(view);
            }


            notifyDataSetChanged();
        }
    }

    /**
     * 删除底部的view
     *
     * @param view
     */
    public void addFooterView(View view) {
        if (mRealAdapter != null) {

            if (!mFooterViews.contains(view)) {
                mFooterViews.add(view);
            }

            notifyDataSetChanged();
        }
    }

    /**
     * 删除底部的view
     *
     * @param view
     */
    public void removeFooterView(View view) {
        if (mRealAdapter != null) {
            if (mFooterViews.contains(view)) {
                mFooterViews.remove(view);
            }

            notifyDataSetChanged();
        }
    }

    private class createFooterViewHolder extends RecyclerView.ViewHolder {
        public createFooterViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
