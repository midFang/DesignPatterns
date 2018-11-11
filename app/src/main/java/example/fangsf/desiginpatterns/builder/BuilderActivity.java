package example.fangsf.desiginpatterns.builder;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import example.fangsf.desiginpatterns.R;

public class BuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilder);

        ConstraintLayout viewGroup = findViewById(R.id.ViewGroup);


//        NavigationBar bar = new NavigationBar.Builder(this, R.layout.ui_navigation_bar, viewGroup)
//                .setText(R.id.back_tv, "确认")
//                .setOnClickListener(R.id.back_tv, new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Toast.makeText(BuilderActivity.this, "click", Toast.LENGTH_SHORT).show();
//                    }
//                }).create();


        DefaultNavigationBar defaultNavigationBar =
                new DefaultNavigationBar.Builder(this, viewGroup)
                        .setText("back")
                        .setLeftTextVisible(View.INVISIBLE)
                        .setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(BuilderActivity.this, "back", Toast.LENGTH_SHORT).show();
                            }
                        }).create();




    }
}
