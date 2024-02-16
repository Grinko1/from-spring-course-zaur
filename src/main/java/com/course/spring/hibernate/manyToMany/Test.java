package com.course.spring.hibernate.manyToMany;

import com.course.spring.hibernate.manyToMany.entity.Child;
import com.course.spring.hibernate.manyToMany.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class).addAnnotatedClass(Section.class).buildSessionFactory();
             Session session = factory.getCurrentSession();
        ) {
            session.beginTransaction();
            Child child = session.get(Child.class, 5);
//            System.out.println(child.getSections());
//            Section section = session.get(Section.class, 6);
//            System.out.println(section.getChildren());
//            session.delete(section);
            session.delete(child);

//            Section s1 = new Section("Dance");
//
//            Child ch1 = new Child("Child4", 12);
//            Child ch2 = new Child("Child4", 12);
//            Child ch3 = new Child("Child4", 12);
//            s1.addChildren(ch1);
//            s1.addChildren(ch2);
//            s1.addChildren(ch3);
//            Section s1 = new Section("Dance");
//            Section s2 = new Section("Drawing");
//            Section s3 = new Section("Singing");
//            ch1.addSection(s1);
//            ch1.addSection(s2);
//            ch1.addSection(s3);



//            session.persist(s1);

            session.getTransaction().commit();
        }
    }
}
