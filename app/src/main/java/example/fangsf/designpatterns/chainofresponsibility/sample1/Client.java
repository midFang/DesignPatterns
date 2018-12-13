package example.fangsf.designpatterns.chainofresponsibility.sample1;


/**
 * Created by apple on 2018/12/9
 */
public class Client {

    public static void main(String[] args){

        // 责任链设计模式, 让所有的对象都有机会处理请求, 形成一条链, 沿着这条链处理请求, 直到处理完为止

        WXUserSystem wxUserSystem = new WXUserSystem();
        QQUserSystem qqUserSystem = new QQUserSystem();

        // 微信系统查询完成后, 如果没有查询到,继续查询QQ系统
        wxUserSystem.nextHandler(qqUserSystem);

        // 假设此时,又假如了另外一个系统, OthersUserSystem, 再次形成责任链式
        OthersUserSystem othersUserSystem = new OthersUserSystem();
        qqUserSystem.nextHandler(othersUserSystem);


        User zhangsan = wxUserSystem.queryUserInfo("zhangsan", "001");

        System.out.println(zhangsan.name +"--------" + zhangsan.userId);


    }


}
