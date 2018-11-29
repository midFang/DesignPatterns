package example.fangsf.designpatterns.observer.sample4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import example.fangsf.designpatterns.R;

/**
 * 数据的更新和插入, 观察者设计模式
 */
public class AddUserInfoActivity extends AppCompatActivity {

    private EditText mEtName;
    private EditText mEtAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user_info);

        mEtName = findViewById(R.id.et_name);
        mEtAge = findViewById(R.id.et_age);

    }

    public void click3(View view) {

        finish();

    }

    public void click2(View view) {
        // 添加用户

        DataBaseManager.getInstance().insert(new User(mEtName.getText().toString(), mEtAge.getText().toString()));
    }
}
