package cn.rayest.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Rayest on 2016/7/20 0020.
 */
public class LoginAction extends ActionSupport{
    private String account;
    private String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute(){
        System.out.println("ִ����Ĭ�ϵ� execute()...");
        if (account.equalsIgnoreCase("Pay") && password.equals("123456")){
            return SUCCESS;
        }
        else {
            return LOGIN;
        }
    }

    public String show(){
        System.out.println("ִ����Ĭ�ϵ� show ()...");
        if (account.equalsIgnoreCase("Pay") && password.equals("123456")){
            return SUCCESS;
        }
        else {
            return LOGIN;
        }
    }
}
