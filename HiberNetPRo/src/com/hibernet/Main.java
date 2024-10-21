package com.hibernet;

import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // Initialize Hibernate SessionFactory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        StudentDao studentDao = new StudentDao(sessionFactory);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        try {
            // Insert Data Row 1
            Student student1 = new Student();
            student1.setFirstName("newOne");
            student1.setLastName("Doe");
            student1.setDateOfBirth(sdf.parse("2001-02-15"));
            student1.setGrade("B#");
            
            
            session.save(student1);
            
            transaction.commit();
            session.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
    }
}
