package com.course.spring.introdusion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLExample {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            Person person = context.getBean("person", Person.class);
            person.callYourPet();
            System.out.println(person.getName() + " " + person.getAge());

        }
    }
}
