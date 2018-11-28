package example.fangsf.designpatterns.observer.sample1.observer;

/**
 * Created by apple on 2018/11/28
 * Useful:  WxUser 具体的微信用户
 */
public class WxUser implements IWXUser {


    private String name;

    public WxUser(String name) {
        this.name = name;
    }

    @Override
    public void push(String article) {

        System.out.println(name + " 收到了一篇文章 " + article);


    }
}
