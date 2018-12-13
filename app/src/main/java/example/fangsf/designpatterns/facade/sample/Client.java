package example.fangsf.designpatterns.facade.sample;


/**
 * Created by apple on 2018/12/9
 * 外观设计模式: 一个子系统的外部与其内部的通讯,必须通过一个统一的对象进行;
 * 提供一个高层次的接口,使得子系统更加易于使用, 说白了, 就是封装
 */
public class Client {

    public static void main(String[] args) {

//        WXUserSystem wxUserSystem = new WXUserSystem();
//        QQUserSystem qqUserSystem = new QQUserSystem();
//
//        // 微信系统查询完成后, 如果没有查询到,继续查询QQ系统
//        wxUserSystem.nextHandler(qqUserSystem);
//
//        // 假设此时,又假如了另外一个系统, OthersUserSystem, 再次形成责任链式
//        OthersUserSystem othersUserSystem = new OthersUserSystem();
//        qqUserSystem.nextHandler(othersUserSystem);
//
//
//        User zhangsan = wxUserSystem.queryUserInfo("zhangsan", "001");
//
//        System.out.println(zhangsan.name + "--------" + zhangsan.userId);
        // 将上面的代码封装起来,这部分代码, 假如下一次进入新的系统, 还是一样的, 大致一样的意思, 所以可以封装起来

        UserSystemFacade facade = new UserSystemFacade();
        User zhangsan = facade.queryUserInfo("zhangsan", "001");

        System.out.println(zhangsan.name + "--------" + zhangsan.userId);

        // 类似的: ContextImpl   Retrofit 使用到了外观设计模式, 统一用一个对象来处理


    }


}
