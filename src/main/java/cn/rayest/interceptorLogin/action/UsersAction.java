package cn.rayest.interceptorLogin.action;

import cn.rayest.interceptorLogin.model.User;
import cn.rayest.interceptorLogin.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by Rayest on 2016/8/21 0021.
 */
public class UsersAction extends ActionSupport {
    private UserService userService = new UserService();
    private User user;
    private String error;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String execute() throws Exception {
        if (userService.login(user)) {
            ActionContext actionContext = ActionContext.getContext();
            Map<String, Object> sessions = actionContext.getSession();
            sessions.put("currentUser", user);
            return SUCCESS;
        } else {
            this.error = "用户名或密码错误";
            return error;
        }
    }
}
