package cn.rayest.user.action;


import cn.rayest.user.model.User;
import cn.rayest.user.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Rayest on 2016/7/5 0005.
 */
public class UserAction2 extends ActionSupport{

    private UserService userService = new UserService();
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String execute() throws Exception {
        System.out.println("执行了 UserAction2 的默认方法");
        if (userService.login(user)){
            return SUCCESS;
        }
        else {
            return ERROR;
        }
    }
}
