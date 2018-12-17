package example.fangsf.designpatterns.command.sample1;

/**
 * Created by fangsf on 2018/12/17.
 * Useful:  请求者角色
 */
public class Invoker {

    // 持有一个对相应命令对象的引用
    private Command mCommand;

    public Invoker(Command command) {
        this.mCommand = command;
    }

    public void action(){
        // 调用命令执行相关的方法
        mCommand.execute();
    }

}
