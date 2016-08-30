package cn.rayest.interceptor;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Rayest on 2016/8/21 0021.
 */
public class InterceptorAction extends ActionSupport {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("执行了 InterceptorAction 的默认方法");
        return SUCCESS;
    }
}
