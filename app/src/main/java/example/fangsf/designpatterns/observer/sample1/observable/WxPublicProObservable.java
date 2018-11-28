package example.fangsf.designpatterns.observer.sample1.observable;

import java.util.List;

import example.fangsf.designpatterns.observer.sample1.observer.IWXUser;

/**
 * Created by apple on 2018/11/28
 * Useful:
 */
public class WxPublicProObservable extends WXPublicObservable {



    public void setArticle(String article) {
        // 更新文章
        update(article);
    }



}
