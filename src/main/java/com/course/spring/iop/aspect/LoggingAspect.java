package com.course.spring.iop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
//    @Pointcut("execution(* com.course.spring.iop.LibraryU.*(..))")
//    private void allMethods(){
//
//    }
//    @Pointcut("execution(* com.course.spring.iop.LibraryU.return*(..))")
//    private void returnMethod(){
//
//    }
//    @Pointcut("allMethods() && !returnMethod()")
//    private void allMethodsExceptReturnMethod(){
//
//    }
//
//    @Before("allMethodsExceptReturnMethod()")
//    public void beforeAllMethods(){
//        System.out.println("beforeAllMethods except return");
//    }

//    @Pointcut("execution(* get*())")
//    private void allGetMethods() {
//
//    }

//    @Pointcut("execution(* return*(..))")
//    private void returnAllMethods() {
//
//    }
//
//    @Pointcut("allGetMethods() || returnAllMethods()")
//    private void getAndReturnMethods() {
//
//    }

    @Before("com.course.spring.iop.aspect.MyPointCuts.allGetMethods()")
    public void beforeAllGetMethodsAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        for (Object arg :args){
            System.out.println(arg);
        }

        System.out.println(methodSignature.getReturnType());
        System.out.println(methodSignature.getName());
        System.out.println(methodSignature);
        System.out.println(methodSignature.getMethod());
        System.out.println("****LOGGING ASPECT****");
    }
    @AfterReturning("com.course.spring.iop.aspect.MyPointCuts.allGetMethods()")
    public void afterGet(){
        System.out.println("after method");
    }
//        @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("\\\\\\\\Check access//////");
//    }

//    @Before("returnAllMethods()")
//    public void beforeAllReturnMethods() {
//        System.out.println("*****BEFORE ALL RETURN METHODS*****");
//    }
//
//    @Before("getAndReturnMethods()")
//    public void allGetAndReturnMethodsAdvice() {
//        System.out.println("\\\\\\ Get and Return /////");
//    }

//    @Pointcut("execution(public void get*(..))")
//    private void allGetMethods() {
//    }

//    @Before("execution(public void com.course.spring.iop.LibraryU.getBook(..))")
//    public void BeforeGetBookAdvice() {
//        System.out.println("***BeforeGetBookAdvice***");
//    }
//
//    @Before("allGetMethods()")
//    public void BeforeGetMethodAdvice() {
//        System.out.println("***BeforeGetMethodAdvice***ALL GET METHODS");
//    }
//
//    @Before("execution(public void return*(..))")
//    public void BeforeReturnMagazineWithParameter() {
//        System.out.println("***BeforeReturnMagazineWithParameter***");
//    }
//
//    @Before("execution(public String return*())")
//    public void BeforeReturnMagazineAdvice() {
//        System.out.println("***BeforeReturnMagazineAdvice***");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("\\\\\\\\Check access//////");
//    }
}
