package example.fangsf.designpatterns.proxy.sample1;

/**
 * Created by fangsf on 2018/11/30.
 * Useful:  代理对象: 银行的工作人员, 给办卡人操作流程, 代理的过程
 */
public class BankWorker implements IBank {

    private IBank mIBank;

    //代理对象给被代理对象 办理业务
    public BankWorker(IBank iBank) {
        this.mIBank = iBank;
    }

    @Override
    public void applyBank() {
        System.out.println("请问需要办理什么也去");
        mIBank.applyBank();
        System.out.println("办理完毕");
    }
}
