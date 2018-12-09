package example.fangsf.designpatterns.iterator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import example.fangsf.designpatterns.R;
import example.fangsf.designpatterns.iterator.sample3.MainBottomItem;
import example.fangsf.designpatterns.iterator.sample3.TabBottomNavigation;
import example.fangsf.designpatterns.iterator.sample3.iterator.TabListIterator;

public class BottomTabActivity extends AppCompatActivity {

    private TabBottomNavigation mBottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_tab);

        mBottomNavigation = findViewById(R.id.tab_bottom);


        TabListIterator<MainBottomItem> listIterator = new TabListIterator<>();
        listIterator.addItem(new MainBottomItem.Builder(this)
                .resIcon(R.drawable.main_tab_item).text("text1").create());
        listIterator.addItem(new MainBottomItem.Builder(this)
                .resIcon(R.drawable.main_tab_item).text("text2").create());
        listIterator.addItem(new MainBottomItem.Builder(this)
                .resIcon(R.drawable.main_tab_item).text("text3").create());


        mBottomNavigation.addTabItem(listIterator);


    }

}
