package com.course.spring.introdusion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
//            Pet pet = context.getBean("cat", Cat.class);
//            pet.say();
            Person person = context.getBean("person", Person.class);
            person.callYourPet();
            System.out.println(person.getName() + " " + person.getAge());

        }
    }
}
