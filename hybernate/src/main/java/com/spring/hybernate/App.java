package com.spring.hybernate;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx = session.beginTransaction();
//        Student s1 = new Student(131,"Gokul","Madurai");
//        Student s2 = session.find(Student.class, 131);
//        System.out.println(s2);
//        Subject sbj1 = new Subject(1, "Java", 90);
//        s2.setName("Vashanth TS");
//        session.update(s2);
//        session.save(s1);
//        session.save(sbj1);
//        session.delete(s2);
//        tx.commit();
        ArrayList<Student> list = (ArrayList)session.createQuery("From Student").list();
        for(Student std:list) {
        	System.out.println(std);
        }
    }
}
