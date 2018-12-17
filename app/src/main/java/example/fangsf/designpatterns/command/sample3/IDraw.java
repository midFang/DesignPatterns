package example.fangsf.designpatterns.command.sample3;

import android.graphics.Canvas;

/**
 * Created by fangsf on 2018/12/17.
 * Useful: 对于每一次绘制,都可以有两个命令, 一个是绘制命令,另一个是撤销的命令,我们将其封装成一个接口
 */
public interface IDraw {

    void draw(Canvas canvas);

    void undo();


}
