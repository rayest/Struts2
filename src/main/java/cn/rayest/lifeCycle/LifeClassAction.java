package cn.rayest.lifeCycle;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Rayest on 2016/8/21 0021.
 */
public class LifeClassAction extends ActionSupport {

    // ÿ�����󶼴���һ����ʵ��
    public LifeClassAction() {
        System.out.println(this);
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
