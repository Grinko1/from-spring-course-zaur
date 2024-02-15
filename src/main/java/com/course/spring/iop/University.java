package com.course.spring.iop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent(){
        students.add(new Student("student1", 2, 7.9));
        students.add(new Student("student2", 5, 6.8));
        students.add(new Student("student3", 3, 8.3));
    }

    public List<Student> getStudents() {
        System.out.println(students);
        System.out.println(students.get(3));
        return students;
    }
}
