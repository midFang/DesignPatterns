package example.fangsf.designpatterns.command.sample3;

import android.graphics.Path;

/**
 * Created by fangsf on 2018/12/17.
 * Useful:  笔触
 */
public interface IBrush {

    // 按下的位置
    void down(Path path, float x, float y);


    //移动的位置
    void move(Path path, float x, float y);

    // 抬起
    void up(Path path, float x, float y);

}
