package example.fangsf.designpatterns.command.sample3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by fangsf on 2018/12/17.
 * Useful:  真正的执行者画布
 */
public class DrawCanvas extends SurfaceView implements SurfaceHolder.Callback {
    public boolean isDrawing, isRunning;

    private Bitmap mBitmap; // 绘制到的位图对象
    private DrawInvoker mInvoker;  // 绘制命令的请求对象
    private drawThread mThread;  // 绘制线程

    public DrawCanvas(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        mInvoker = new DrawInvoker();
        mThread = new drawThread();

        getHolder().addCallback(this);
    }

    /**
     * 增加一条绘制路径
     */
    public void add(DrawPath path) {
        mInvoker.add(path);
    }

    /**
     * 重做上一部的撤销绘制
     */
    public void redo() {
        isDrawing = true;
        mInvoker.redo();
    }

    /**
     * 撤销上一部的撤销绘制
     */
    public void undo() {
        isDrawing = true;
        mInvoker.undo();
    }

    /**
     * 是否可以撤销
     */
    public boolean canUndo() {
        return mInvoker.canUndo();
    }

    /**
     * 是否可以重做
     */
    public boolean canRedo() {
        return mInvoker.canRedo();
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        isRunning = true;
        mThread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        mBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        boolean retry = true;
        isRunning = false;
        while (retry) {
            try {
                mThread.join();
                retry = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private class drawThread extends Thread {

        @Override
        public void run() {

            Canvas canvas = null;
            while (isRunning) {
                if (isDrawing) {
                    try {
                        canvas = getHolder().lockCanvas(null);
                        if (mBitmap == null) {
                            mBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                        }

                        Canvas c = new Canvas(mBitmap);
                        c.drawColor(0, PorterDuff.Mode.CLEAR);

                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        mInvoker.execute(c);
                        canvas.drawBitmap(mBitmap, 0, 0, null);

                    } finally {
                        getHolder().unlockCanvasAndPost(canvas);
                    }
                    isDrawing = false;
                }
            }

        }
    }

}
