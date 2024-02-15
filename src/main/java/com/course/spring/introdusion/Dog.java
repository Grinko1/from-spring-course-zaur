package com.course.spring.introdusion;

import org.springframework.stereotype.Component;

//@Component("dog")
public class Dog implements Pet {
    @Override
    public void say(){
        System.out.println("Bark");
    }
}
