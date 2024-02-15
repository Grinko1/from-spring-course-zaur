package com.course.spring.iop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("book-name")
    private String name;
    @Value("Author smon")
    private String author;
    @Value("1990")
    private int year;


    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
