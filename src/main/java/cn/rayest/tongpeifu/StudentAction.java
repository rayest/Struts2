package cn.rayest.tongpeifu;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String list(){
        System.out.println("����ѧ��");
        name = "����ѧ��";
        return SUCCESS;
    }

    public String add(){
        System.out.println("���ѧ��");
        name = "���ѧ��";
        return SUCCESS;
    }

    public String update(){
        System.out.println("����ѧ��");
        name = "����ѧ��";
        return SUCCESS;
    }

    public String delete(){
        System.out.println("ɾ��ѧ��");
        name = "ɾ��ѧ��";
        return SUCCESS;
    }
}
