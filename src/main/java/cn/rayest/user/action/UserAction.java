package cn.rayest.user.action;


import cn.rayest.user.model.User;
import cn.rayest.user.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Rayest on 2016/7/5 0005.
 */
public class UserAction extends ActionSupport{

    private UserService userService = new UserService();
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute() throws Exception {
        System.out.println("执行了 UsersAction 的默认方法");
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        if (userService.login(user)){
            return SUCCESS;
        }
        else {
            return ERROR;
        }
    }
}
