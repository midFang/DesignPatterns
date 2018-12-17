package example.fangsf.designpatterns.command.sample2;

import android.widget.Button;

/**
 * Created by fangsf on 2018/12/17.
 * Useful:  操作俄罗斯方块的一个小例子
 */
public class Client {

    public static void main(String[] args) {


        // 1,假设有俄罗斯方块游戏, 里面有操作的方式
        TetrisMachine machine = new TetrisMachine();

        //2,根据游戏 构建出操作的命令
        LeftCommand leftCommand = new LeftCommand(machine);
        RightCommand rightCommand = new RightCommand(machine);

        // 3,按钮可以执行不同的命令
        Buttons buttons = new Buttons();

        buttons.setLeftCommand(leftCommand);
        buttons.setRightCommand(rightCommand);

        // 4,那个按钮操作了, 就操作那个命令
        buttons.getLeftCommand().execute();
        buttons.getRightCommand().execute();


        /**
         *         TetrisMachine machine1 = new TetrisMachine();
         *         machine1.toRight();
         *         machine1.toLeft();
         *         machine1.fastBottom();
         *
         *     开发过程中,可能大部分会这样处理, 毕竟这样也不用写很多代码,
         *     如上方,使用命令模式,其实也做到了一种解耦的方式, 其中还有一个重要的原则,开闭原则,对内修改是关闭的,对外扩展是开放的
         *
         *     使用命令模式,更好的一个是可以记录功能: 如, 在执行过的操作的请求需要命令记录的功能
         */


    }

}
