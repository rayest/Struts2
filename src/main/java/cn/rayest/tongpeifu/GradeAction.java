package cn.rayest.tongpeifu;

import com.opensymphony.xwork2.ActionSupport;

public class GradeAction extends ActionSupport {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String list() throws Exception {
        System.out.println("�༶����");
        name = "�༶����";
        return SUCCESS;
    }

    public String add() throws Exception {
        System.out.println("�༶���");
        name = "�༶���";
        return SUCCESS;
    }

    public String update() throws Exception {
        System.out.println("�༶�޸�");
        name = "�༶�޸�";
        return SUCCESS;
    }

    public String delete() throws Exception {
        System.out.println("�༶ɾ��");
        name = "�༶ɾ��";
        return SUCCESS;
    }

}
