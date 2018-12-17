package example.fangsf.designpatterns.command.sample3;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import example.fangsf.designpatterns.R;

public class CommandActivity extends AppCompatActivity {

    private DrawPath mPath;
    private Paint mPaint;
    private IBrush mIBrush;
    private DrawCanvas mDrawCanvas;
    private Button mBtnUndo, mBtnRedo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command);

        mPaint = new Paint();
        mPaint.setColor(Color.parseColor("#ff0000"));
        mPaint.setStrokeWidth(5);

        mIBrush = new NormalBrush();

        mDrawCanvas = findViewById(R.id.draw_canvas);
        mDrawCanvas.setOnTouchListener(new DrawTouchListener());

        mBtnUndo = findViewById(R.id.btn_undo);
        mBtnUndo.setEnabled(false);
        mBtnRedo = findViewById(R.id.btn_redo);
        mBtnRedo.setEnabled(false);

    }

    private class DrawTouchListener implements View.OnTouchListener {

        @Override
        public boolean onTouch(View v, MotionEvent event) {

            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                mPath = new DrawPath();
                mPath.mPaint = new Paint();
                mPath.mPath = new Path();
                mIBrush.down(mPath.mPath, event.getX(), event.getY());
            }

            if (event.getAction() == MotionEvent.ACTION_MOVE) {
                mIBrush.move(mPath.mPath, event.getX(), event.getY());
            }

            if (event.getAction() == MotionEvent.ACTION_UP) {
                mIBrush.up(mPath.mPath, event.getX(), event.getY());
                mDrawCanvas.add(mPath);
                mDrawCanvas.isDrawing = true;

                mBtnUndo.setEnabled(true);
                mBtnRedo.setEnabled(false);
            }

            return true;
        }
    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_red: // 切换为红色
                mPaint = new Paint();
                mPaint.setStrokeWidth(5);
                mPaint.setColor(0xFFFF0000);

                break;

            case R.id.btn_blue:    // 切换为蓝色
                mPaint = new Paint();
                mPaint.setStrokeWidth(5);
                mPaint.setColor(0xFF0000FF);
                break;

            case R.id.btn_green: //切换成绿色
                mPaint = new Paint();
                mPaint.setStrokeWidth(5);
                mPaint.setColor(0xFF00FF00);
                break;

            case R.id.btn_undo:
                mDrawCanvas.undo();
                if (!mDrawCanvas.canUndo()) {
                mBtnUndo.setEnabled(false);
                }
                mBtnRedo.setEnabled(true);

                break;

            case R.id.btn_redo:
                mDrawCanvas.redo();
                if (!mDrawCanvas.canRedo()) {
                    mBtnRedo.setEnabled(false);
                }
                mBtnUndo.setEnabled(true);

                break;

            case R.id.btn_normal:
                mIBrush = new NormalBrush();
                break;

            case R.id.btn_circle:
                mIBrush = new CircleBrush();
                break;

            default:
                break;
        }

    }


}
