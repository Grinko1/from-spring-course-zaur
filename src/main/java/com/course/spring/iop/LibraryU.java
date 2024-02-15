package com.course.spring.iop;

import org.springframework.stereotype.Component;

@Component("libraryUBean")
public class LibraryU extends AbstractLibrary {
    public void getBook(){
        System.out.println("take a book from university ");
        System.out.println("--------------------------------");
    }


    public void returnBook(){
        System.out.println("return a book to university");
        System.out.println("--------------------------------");
    }
    public void getMagazine(){
        System.out.println("take a magazine from university");
        System.out.println("--------------------------------");
    }
    public String returnMagazine(){
        System.out.println("return a magazine to university");
        System.out.println("--------------------------------");
        return "";
    }
    public void addBook(String personName, Book book){
        System.out.println("Add book to the university");
        System.out.println("--------------------------------");
    }
    public void addMagazine(){
        System.out.println("Add magazine to the university");
        System.out.println("--------------------------------");
    }
}
