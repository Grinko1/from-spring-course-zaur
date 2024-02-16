package com.course.spring.hibernate.oneToMany;

import com.course.spring.hibernate.oneToMany.entity.Department;
import com.course.spring.hibernate.oneToMany.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        try (
                SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).buildSessionFactory();
                Session session = factory.getCurrentSession();
        ) {
            session.beginTransaction();
            Employee employee = session.get(Employee.class,4);
            session.delete(employee);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());

//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmployeeList());

//            Department department = new Department("sales", 3000, 500);
//            Employee emp1 = new Employee("worker3", "surname", 500);
//            Employee emp2 = new Employee("worker4", "surname", 900);
//            Employee emp3 = new Employee("worker5", "surname", 1600);
//            department.addEmployee(emp1);
//            department.addEmployee(emp2);
//            department.addEmployee(emp3);
//            session.persist(department);

            session.getTransaction().commit();
        }
    }
}
