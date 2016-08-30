package cn.rayest.user.action;

import cn.rayest.user.model.User;
import cn.rayest.user.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by Rayest on 2016/7/5 0005.
 */
public class UserAction3 extends ActionSupport implements ModelDriven<User>{

    private UserService userService = new UserService();
    private User user = new User();
    public String execute() throws Exception {
        System.out.println("执行了 UserAction3 的默认方法");
        if (userService.login(user)){
            return SUCCESS;
        }
        else {
            return ERROR;
        }
    }

    public User getModel() {
        return user;
    }
}
