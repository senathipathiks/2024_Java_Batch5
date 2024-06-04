package com.madhan.hibernateex;




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
        Configuration cfg = new Configuration ().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
//        Student s1 = new Student(16,"Madhan","Madurai");
//        Student s2 = session.find(Student.class,16);
        Student s3 = new Student(17,"Ram","OOty");
//        s1.setCity("Ooty");
//        session.update(s1);
//        System.out.println(s2);
//        session.save(s1);
//        session.delete(s3);
//        tx.commit();
        
        ArrayList<Student> list = (ArrayList)session.createQuery("From Student").list();
        for(Student student:list)
        {
        	System.out.println(student);
        }
        
    }
}
