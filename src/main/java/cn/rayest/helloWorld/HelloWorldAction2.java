package cn.rayest.helloWorld;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Rayest on 2016/7/5 0005.
 */
public class HelloWorldAction2 extends ActionSupport{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute() throws Exception {
        System.out.println("执行了 Action 的默认方法");
        return SUCCESS;
    }
}
