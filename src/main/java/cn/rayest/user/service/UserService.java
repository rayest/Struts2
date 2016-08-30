package cn.rayest.user.service;


import cn.rayest.user.model.User;

/**
 * Created by Rayest on 2016/7/5 0005.
 */
public class UserService {
    public boolean login(User user){
        if (("Pay".equals(user.getUserName()) && ("123456".equals(user.getPassword())))){
            return true;
        }
        else {
            return false;
        }
    }
}
