package example.fangsf.designpatterns.command.sample1;

/**
 * Created by fangsf on 2018/12/17.
 * Useful:  具体的命令角色
 */
public class ConcreteCommand implements Command {

    private Receiver mReceiver; // 持有一个对接受者对象的引用

    public ConcreteCommand(Receiver receiver) {
        mReceiver = receiver;
    }

    @Override
    public void execute() {
        // 调用接收者的相关方法来执行具体的操作
        mReceiver.action();
    }
}
