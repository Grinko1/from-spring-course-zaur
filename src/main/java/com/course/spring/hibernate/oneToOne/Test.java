package com.course.spring.hibernate.oneToOne;

import com.course.spring.hibernate.oneToOne.entity.Detail;
import com.course.spring.hibernate.oneToOne.entity.Employee;
import com.course.spring.introdusion.entity.Details;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory();
             Session session = factory.getCurrentSession();
        ) {

//            Employee employee = new Employee("Third", "surname", "it", 1000);
//            Detail detail = new Detail("City3", 98457492, "email@comw.df");
//            employee.setDetail(detail);
//            detail.setEmployee(employee);

            session.beginTransaction();
            Detail detail = session.get(Detail.class,1);
            System.out.println(detail);
            session.delete(detail);

//          session.save(detail);

            session.getTransaction().commit();
        }
    }
}
