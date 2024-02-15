package com.course.spring.introdusion;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("person")
//@Scope("singleton")
public class Person {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    private Pet pet;

    @Autowired
    public Person(@Qualifier("cat") Pet pet) {
        this.pet = pet;
    }

    @PostConstruct
    public void init(){
        System.out.println("init person");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy person");
    }
    public void callYourPet(){
        System.out.println("Calling my pet");
        pet.say();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
