package cn.rayest.multiModule;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Rayest on 2016/7/6 0006.
 */
public class CheLiangAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    @Override
    public String execute() throws Exception {
        System.out.println("ִ���� CheLiangAction ��Ĭ�Ϸ���");
        return SUCCESS;
    }
}
