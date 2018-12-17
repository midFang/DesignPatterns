package example.fangsf.designpatterns.command.sample3;

import android.graphics.Path;

/**
 * Created by fangsf on 2018/12/17.
 * Useful:  圆形的笔触
 */
public class CircleBrush implements IBrush {

    @Override
    public void down(Path path, float x, float y) {

    }

    @Override
    public void move(Path path, float x, float y) {
        path.addCircle(x, y, 10, Path.Direction.CW);
    }

    @Override
    public void up(Path path, float x, float y) {

    }
}
