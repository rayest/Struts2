package cn.rayest.helloWorld;

import com.opensymphony.xwork2.Action;

/**
 * Created by Rayest on 2016/7/5 0005.
 */
public class HelloWorldAction implements Action {

    public String execute(){
        System.out.println("ִ���� Action ��Ĭ�Ϸ���");
        return SUCCESS;
    }
}
