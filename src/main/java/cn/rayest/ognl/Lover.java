package cn.rayest.ognl;

/**
 * Created by Rayest on 2016/8/21 0021.
 */
public class Lover {
    private String name;
    private int age;

    public Lover() {
    }

    public Lover(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
