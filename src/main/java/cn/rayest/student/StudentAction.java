package cn.rayest.student;

import com.opensymphony.xwork2.Action;

import java.util.List;

public class StudentAction implements Action{

	private List<Student> students;
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String execute() throws Exception {
		System.out.println("执行了 Action 的默认方法");
		for(Student s:students){
			System.out.println(s);
		}
		return SUCCESS;
	}

}
