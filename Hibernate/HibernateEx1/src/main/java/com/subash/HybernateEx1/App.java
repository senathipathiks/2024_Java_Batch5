package com.subash.HybernateEx1;

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
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
//        Student s1 = new Student(123,"subash","Madurai");
//        session.save(s1);
//        Student s1 = new Student(124,"subash","Madurai");
//        Student s3 = new Student(125,"subash","Madurai");
//        Student s4 = new Student(126,"subash","Madurai");
//        session.save(s1);
//        session.save(s3);
//        session.save(s4);  // insert
        
        Student s2 = session.find(Student.class, 123);  //find
        s2.setCity("Usilampatti");
        session.update(s2); //update
        
        ArrayList<Student> list = (ArrayList)session.createQuery("From Student").list();
        for(Student s:list) {
        	System.out.println(s);
        }
        
        Student s5 = session.find(Student.class, 123);  //find
        if(s5 !=null) {
        	session.delete(s5);            // delete
        	System.out.println("record delete");
        } else {
        	System.out.println("No records found");
        }
        
        
        tx.commit();
    }
}
