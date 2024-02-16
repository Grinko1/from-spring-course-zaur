package com.course.spring.hibernate.oneToManyUni;

import com.course.spring.hibernate.oneToManyUni.entity.Department;
import com.course.spring.hibernate.oneToManyUni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class).buildSessionFactory();
             Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Department department = session.get(Department.class,4);
            System.out.println(department.getEmployeeList());
//            session.delete(department);
//            Department department = new Department("test", 3000, 500);
//            Employee emp1 = new Employee("worker6", "surname", 500);
//            Employee emp2 = new Employee("worker7", "surname", 900);
//            Employee emp3 = new Employee("worker8", "surname", 1600);
//            department.addEmployee(emp1);
//            department.addEmployee(emp2);
//            department.addEmployee(emp3);
////
//            session.save(department);

            session.getTransaction().commit();
        }
    }
}
