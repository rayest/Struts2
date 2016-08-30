package cn.rayest.validator;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Rayest on 2016/8/21 0021.
 */
public class RegisterAction extends ActionSupport {
    private Register register;

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("传入的用户：" + register);
        return SUCCESS;
    }
}
