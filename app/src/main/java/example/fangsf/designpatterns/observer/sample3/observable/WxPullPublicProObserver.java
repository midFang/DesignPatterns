package example.fangsf.designpatterns.observer.sample3.observable;

/**
 * Created by apple on 2018/11/28
 * Useful:
 */
public class WxPullPublicProObserver extends WxPullPublicObservable {


    private String article;

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;


        // 更新文章
        update(article);
    }


}
