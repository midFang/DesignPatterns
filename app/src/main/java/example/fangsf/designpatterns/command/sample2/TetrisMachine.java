package example.fangsf.designpatterns.command.sample2;

/**
 * Created by fangsf on 2018/12/17.
 * Useful: 具体的操作
 */
public class TetrisMachine {

    public void toLeft() {
        System.out.println("toleft");
    }

    public void toRight(){
        System.out.println("toright");

    }

    // 快速下降
    public void fastBottom(){
        System.out.println("toFastBottom");
    }



}
