package cn.rayest.validatorMy;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Rayest on 2016/8/22 0022.
 */
public class ValidationAction extends ActionSupport{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("ÐÕÃû£º" + name);
        return SUCCESS;
    }
}
