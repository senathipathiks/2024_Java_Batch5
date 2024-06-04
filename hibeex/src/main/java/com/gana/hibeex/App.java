package com.gana.hibeex;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Student s1 = new Student(123,"Ganapathy","Madurai");
        session.save(s1);
        tx.commit();
        //Student s2 = session.find(Student.class, 123);
//        s2.setCity("Mdu");
//        session.update(s2);
        //System.out.println(s2);
//        tx.commit();
        
        ArrayList<Student> list = (ArrayList)session.createQuery("From Student").list();
        for(Student student : list) {
        	System.out.println(student);
        }
    }
}
