package cn.rayest.result;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Rayest on 2016/8/21 0021.
 */
public class ResultAction extends ActionSupport {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

}
