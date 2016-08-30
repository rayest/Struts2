package cn.rayest.hobby;

import com.opensymphony.xwork2.Action;

/**
 * Created by Rayest on 2016/7/5 0005.
 */
public class HobbyAction implements Action{

    private String[] hobby;

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String execute() throws Exception {
        System.out.println("执行了 Action 的默认方法");
        if (hobby != null){
            for (String h: hobby){
                System.out.println(h);
            }
        }
        return SUCCESS;
    }
}
