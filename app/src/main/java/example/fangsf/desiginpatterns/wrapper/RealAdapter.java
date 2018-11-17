package example.fangsf.desiginpatterns.wrapper;

/**
 * Created by apple on 2018/11/17
 * Useful:
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import example.fangsf.desiginpatterns.R;

/**
 * 默认的recyclerView,是没有添加头部和底部的功能的, 参考ListView是如何处理的(HeaderViewListAdapter->对原有的adapter进行装饰)
 */
public class RealAdapter extends RecyclerView.Adapter<RealAdapter.ViewHolder> {

    private Context mContext;
    private List<String> mItems;

    public RealAdapter(Context context, List<String> items) {
        mContext = context;
        mItems = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_textview, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        viewHolder.mTextView.setText(mItems.get(i));

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mItems.remove(i);
                Toast.makeText(mContext, "删除"+i, Toast.LENGTH_SHORT).show();
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.tv_text);
        }
    }

}