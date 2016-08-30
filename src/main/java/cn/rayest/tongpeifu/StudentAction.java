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
        System.out.println("查找学生");
        name = "查找学生";
        return SUCCESS;
    }

    public String add(){
        System.out.println("添加学生");
        name = "添加学生";
        return SUCCESS;
    }

    public String update(){
        System.out.println("更新学生");
        name = "更新学生";
        return SUCCESS;
    }

    public String delete(){
        System.out.println("删除学生");
        name = "删除学生";
        return SUCCESS;
    }
}
