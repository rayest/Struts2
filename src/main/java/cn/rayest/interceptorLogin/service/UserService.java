package cn.rayest.interceptorLogin.service;

import cn.rayest.interceptorLogin.model.User;

/**
 * Created by Rayest on 2016/8/21 0021.
 */
public class UserService {
    public boolean login(User user){
        if ("pay".equals(user.getUserName()) && "123456".equals(user.getPassword())){
            return true;
        }
        else {
            return false;
        }
    }
}
