package com.course.spring.iop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class)) {
            LibraryU libraryU = context.getBean("libraryUBean", LibraryU.class);
            LibraryS libraryS = context.getBean("librarySBean", LibraryS.class);
            Book book = context.getBean("book", Book.class);
//            libraryU.getBook();
//            libraryS.getBook();
//            libraryU.returnMagazine();
//            libraryS.returnMagazine("");
            libraryU.addBook("Tom", book);
            libraryU.addMagazine();
        }
    }
}
