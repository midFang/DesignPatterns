package example.fangsf.designpatterns.observer.sample4;

/**
 * Created by fangsf on 2018/11/29.
 * Useful:
 */
public class User {

    String name;
    String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
