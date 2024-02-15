package com.course.spring.iop.aspect;

import com.course.spring.iop.Student;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetStudentsAdvice() {
        System.out.println("________BEFORE________");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturning(List<Student> students) {
        students.get(0).setName("Changed name");
        System.out.println("------AFTER RETURNING------");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowing(Throwable exception) {
        System.out.println(exception);
        System.out.println("--------THROWS----------");
    }

    @Around("execution(* getStudents())")
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("********* Around method START ********");
        long start = System.currentTimeMillis();
        Object targetMethodResult =null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        }catch (Exception e){
            System.out.println("Around catch exception " +e);
            throw e;
        }


        long end = System.currentTimeMillis();
        System.out.println("********* Around method COMPLETED ********");
        System.out.println("it take time: " + (end - start));
        return targetMethodResult;
    }

    @After("execution(* getStudents())")
    public void after() {
        System.out.println("--------AFTER-------");
    }
}
