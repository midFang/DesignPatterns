package example.fangsf.designpatterns.adapter.sample2;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by apple on 2018/11/24
 * Useful:
 */
public interface IAdapterTarget {

    public  int getCount();

    public  View getView(int position, ViewGroup parentView);


}
