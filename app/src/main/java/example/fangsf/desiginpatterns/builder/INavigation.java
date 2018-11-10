package example.fangsf.desiginpatterns.builder;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by apple on 2018/11/10
 * Useful:
 */
public interface INavigation {

    void createNavigationBar();

    void attachParentView(ViewGroup viewGroup, View view);

    void attachParams();

}
