package example.fangsf.designpatterns.command.sample1;

/**
 * Created by fangsf on 2018/12/17.
 * Useful: 命令模式: 将一个请求封装成一个对象,从而让用户使用不同的请求把客户端参数化,对请求排队上或者是日志记录,以及支持可撤销的工作
 * <p>
 * 使用命令模式主要是: 行为调用者和 行为的实现者, 更加的解耦
 */
public class Client {

    public static void main(String[] args) {

        // 构建一个接收者对象
        Receiver receiver = new Receiver();

        // 根据接收者对象, 构造一个命令对象
        ConcreteCommand command = new ConcreteCommand(receiver);

        //构建请求者对象
        Invoker invoker = new Invoker(command);

        // 执行请求
        invoker.action();

    }
}
