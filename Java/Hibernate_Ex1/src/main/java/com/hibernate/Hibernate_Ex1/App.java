package com.hibernate.Hibernate_Ex1;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        
    	Configuration cfg = new Configuration().configure("Student.cfg.xml");
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	
//    	Insertion
//    	Student s1 = new Student(12228,"Nagarjun","Madurai");
//    	session.save(s1);
//    	tx.commit();
    	
    	//Deletion
    	//Same as Insertion Just change the save to delete!!!
//    	Student s1 = new Student(12228,"Nagarjun","Madurai");
//    	session.delete(s1);
//    	tx.commit();
    	
//    	Find
//    	Student s1 = session.find(Student.class, 12228);
    	
    	//Update
//    	s1.setCity("Chennai");
//    	session.update(s1);
//    	tx.commit();
//    	System.out.println(s1);
    	
//    	Using ArrayList for finding all details
    	ArrayList<Student> list = (ArrayList<Student>) session.createQuery("From Student").list(); //"From Student" is the class name not the table name
    	//tx.commit();
    	for(Student s : list) {
    		System.out.println(s);
    	}
    	
    }
}
