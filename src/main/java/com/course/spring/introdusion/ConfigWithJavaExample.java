package com.course.spring.introdusion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigWithJavaExample {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)) {
//            Person person = context.getBean("person", Person.class);
//            person.callYourPet();
            Pet cat = context.getBean("catBean", Cat.class);
            cat.say();
            Person person = context.getBean("personBean", Person.class);
            person.callYourPet();
        }
    }
}
