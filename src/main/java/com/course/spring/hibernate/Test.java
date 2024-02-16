package com.course.spring.hibernate;


import com.course.spring.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
             Session session = factory.getCurrentSession()) {
            session.beginTransaction();

 //           **************************************************
//            Create
//            **************************************************

//         Employee emp = new Employee("Aleksandr", "surname", "test", 2300);
//         session.save(emp);





//            *************************************************
//            READ
//            *******************************************************
//            By ID
//            Employee emp = session.get(Employee.class, 1);
//            System.out.println(emp);
//            ****************************************************
//             GET ALL
//            List<Employee> emps = session.createQuery("from Employee").getResultList();
//            System.out.println(emps);
//
//            ****************************************************
//            GET BY NAME

//            List<Employee> emps = session.createQuery("from Employee where name = 'second' AND salary>2000").getResultList();
//            System.out.println(emps);
//            *******************************************************



//            *************************************
//            UPDATE
//            ***********************************
//            Employee employee = session.get(Employee.class, 3);
//            employee.setSalary(900);
//            ***********************************
//            UPDATE WITH QUERY
//             session.createQuery("update Employee set salary=1000 where name='Aleksandr'");
//            ***********************************


//            *************************************
//            DELETE
//            ***********************************

//            Employee employee = session.get(Employee.class, 4);
//            session.delete(employee);

//            OR
//            session.createQuery("delete Employee where name='Aleksandr'").executeUpdate();






            session.getTransaction().commit();

        }
    }
}
