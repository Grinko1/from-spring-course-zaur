package com.course.spring.iop;

import org.springframework.stereotype.Component;

@Component("librarySBean")
public class LibraryS {

    public void getBook() {
        System.out.println("take a book from school");
    }

    public void returnBook() {
        System.out.println("return a book to school");
    }

    public void getMagazine() {
        System.out.println("take a magazine from school");
    }

    public void returnMagazine(String a) {
        System.out.println("return a magazine to school");
    }

}
