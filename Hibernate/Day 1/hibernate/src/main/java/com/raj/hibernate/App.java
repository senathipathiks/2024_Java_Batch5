package com.raj.hibernate;


import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg =  new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx =  session.beginTransaction();
        
//        Insert the value
//        Student s1 = new Student(124,"Subash","Madurai");
//        session.save(s1);
//        tx.commit();
        
//        Delete the value
//          Student s1 = session.find(Student.class,123);
//          if(s1 != null) {
//        	  session.delete(s1); 
//        	  System.out.println("Successfully Deleted!");
//          } else {
//        	  System.out.println("No Record Found!");
//          }
//        tx.commit();
        
        
//        Find the value
//        Student s1 = session.find(Student.class,123);
//        System.out.print(s1);
        
//        Update
//        Student s1 = session.find(Student.class,123);
//        s1.setCity("tuty");
//        session.update(s1);
//        tx.commit();
        
        
//        Display all the Values
//        ArrayList<Student> list = (ArrayList)session.createQuery("From Student").list();
//        for(Student i : list) {
//      	  System.out.println(i);
//        } 
         
    	
    }
}
