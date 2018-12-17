package example.fangsf.designpatterns.command.sample3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by fangsf on 2018/12/17.
 * Useful:  具体绘制路径命令
 */
public class DrawPath implements IDraw {
    public Path mPath; // 需要绘制的路径
    public Paint mPaint; //  绘制画笔


    @Override
    public void draw(Canvas canvas) {
        canvas.drawPath(mPath, mPaint);
    }

    @Override
    public void undo() {

    }
}
