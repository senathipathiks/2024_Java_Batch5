package com.giri.HiberEx;

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
        Student s1= new Student(123,"Giri","Florida");
        //Student s2=session.find(Student.class, 123);
        //s2.setCity("Madurai");
        //session.update(s2);
        session.save(s1);
        tx.commit();
        //System.out.println(s2);
//        ArrayList<Student> list =(ArrayList)session.createQuery("From Student").list();
//        		for( Student student : list) {
//        			System.out.println(student);
//        		}
        
//        Student s5 = session.find(Student.class, 123);  //find
//        if(s5 !=null) {
//        	session.delete(s5);            // delete
//        	System.out.println("record delete");
//        } else {
//        	System.out.println("No records found");
//        }
//        tx.commit();
        

    }
}
