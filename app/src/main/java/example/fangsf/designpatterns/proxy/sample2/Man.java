package example.fangsf.designpatterns.proxy.sample2;

/**
 * Created by fangsf on 2018/11/30.
 * Useful: 被代理对象: 办卡的人员, 需要申请办卡
 */
public class Man implements IBank {

    private String name;

    public Man(String name) {
        this.name = name;
    }


    @Override
    public void applyBank() {
        System.out.println(name + " 需要申请办卡 ");
    }

    @Override
    public void loseBank() {
        System.out.println(name + " 需要挂失银行卡 ");
    }
}
