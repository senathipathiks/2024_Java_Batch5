package com.hibernate.hiberApp;


import org.hibernate.cfg.Configuration;
 
import org.hibernate.Transaction;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	//the above line of code is used when annotations are not used
    	// the below line is used when annotations are used
    	
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	Student s1 = new Student(12,"xxxx","yyyy"); 
    	
    	//Student s2 = session.find(Student.class,123);
    	//s2.setCity("erode");
    	//session.update(s2);
//    	session.delete(s2);
    	//System.out.println(s1);
    	session.save(s1);
    	tx.commit();
//    	System.out.println(s2);
//    	ArrayList<Student> list =(ArrayList)session.createQuery("From Student").list();
//        for(Student stu: list)
//        {
//        	System.out.println(stu);
//        }
    }
}
