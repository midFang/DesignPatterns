package example.fangsf.designpatterns.adapter.sample2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import example.fangsf.designpatterns.R;

/**
 * Created by apple on 2018/11/24
 * Useful:  ListAdapter适配对象, 去适配服务器返回对象(列表), 因为我们的listView 的itemView 需要的是一个view对象, 而不是一个list
 */
public class ListAdapter implements IAdapterTarget {

    private List<String> mList;
    private Context mContext;

    public ListAdapter(List<String> list, Context context) {
        mContext = context;
        mList = list;

    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public View getView(int position, ViewGroup parentView) {

        // 需要的view对象
        TextView view = (TextView) LayoutInflater.from(mContext).inflate(R.layout.item_textview, parentView, false);
        view.setText(mList.get(position));

        return view;
    }
}
