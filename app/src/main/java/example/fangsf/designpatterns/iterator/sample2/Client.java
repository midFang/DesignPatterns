package example.fangsf.designpatterns.iterator.sample2;

import example.fangsf.designpatterns.iterator.sample2.iterator.Iterator;

/**
 * Created by apple on 2018/12/9
 * Useful:  迭代器设计模式, 提供具体的迭代器
 */
public class Client {

    public static void main(String[] args){
        //查询系统中,是否有这个用户

        QQUserSystem qqUserSystem = new QQUserSystem();
        WXUserSystem wxUserSystem = new WXUserSystem();


        User user = queryUserInfo("zhangsan", "001", qqUserSystem.iterator());

        if (user == null) {
            user = queryUserInfo("zhangsan", "001", wxUserSystem.iterator());
        }


        System.out.println("查找这个用户的结果:  " + user.name + "--" +user.userId);
    }

    private static User queryUserInfo(String name, String userId, Iterator<User> iterator) {

        // 判断是否存在这个用户
        while (iterator.hasNext()) {
            User next = iterator.next();
            if (next.name.equals(name) && next.userId.equals(userId)) {
                return next;
            }
        }


        return null;
    }

}
