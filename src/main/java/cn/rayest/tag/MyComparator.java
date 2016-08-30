package cn.rayest.tag;

import cn.rayest.student.Student;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

    public int compare(Student student1, Student student2) {
        if (student1.getAge() > student2.getAge()) {
            return 1;
        } else if (student1.getAge() < student2.getAge()) {
            return -1;
        }
        return 0;
    }

}
