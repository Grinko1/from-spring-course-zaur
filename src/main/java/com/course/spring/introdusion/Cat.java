package com.course.spring.introdusion;

import org.springframework.stereotype.Component;

//@Component("cat")
public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("meow");
    }
}
