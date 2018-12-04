package example.fangsf.designpatterns.prototype.sample6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import example.fangsf.designpatterns.R;

public class Activity3 extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        mTextView = findViewById(R.id.tv_text);

        String params1 = getIntent().getStringExtra("params1");
        String params2 = getIntent().getStringExtra("params2");
        String params3 = getIntent().getStringExtra("params3");

        mTextView.setText(params1 + "\n" + params2 + "\n" + params3 + "\n");
    }
}
