package example.fangsf.desiginpatterns.adapter.sample1;

/**
 * Created by apple on 2018/11/24
 * Useful:  RMBAdapter 适配对象,
 *          USDAdapter 被适配的对象,
 */
public class USDAdapter extends RMBAdapter implements IUSDAdapter {


    public USDAdapter(float rmb) {
        super(rmb);
    }

    @Override
    public float getUSD() {
        return getRmb() * 0.4f;  // 使用接口进行适配
    }
}
