package com.course.spring.iop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut("execution(* addBook(..))")
    public void allGetMethods() {

    }
}
