package example.fangsf.designpatterns.adapter.sample1;

/**
 * Created by apple on 2018/11/24
 * Useful:  需要适配的对象
 */
public class RMBAdapter {

    private float mRmb ;


    public RMBAdapter(float rmb) {
        mRmb = rmb;
    }


    /**
     * 获取人民币的钱数
     * @return
     */
    public float getRmb() {
        return mRmb;
    }


    // 假设还需要,获取同样金额数的美元是多少钱, 通常开发中, 会直接在这里写一个方法
    // 但是这个类, 是处理人民币的类, 最好是使用其他的方式处理

    public float getUSD(){
        return mRmb * 0.4f;
    }


}
