package com.course.spring.iop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)) {
            University university = context.getBean("university", University.class);
            university.addStudent();
           try{
               System.out.println( university.getStudents());
           }catch (Exception e){
               System.out.println(e);
           }
        }
    }
}
