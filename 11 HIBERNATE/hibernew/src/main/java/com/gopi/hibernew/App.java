package com.gopi.hibernew;

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
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        Employee e1 = new Employee("Gopi","SVK");
        session.save(e1);
        
//        Employee u1 = new Employee(13,"gopi","Chennai");  //create and insert
        
//        Employee u2 = session.find(Employee.class,13); // for find the id
        
//        session.delete(u2); // delete must give commit
        
//        Employee u1 = new Employee(10,"siva","Chennai"); // insert new values must give commit
        
//        u2.setCity("VNR");  // set values for updation
        
//        session.save(u1); //save for create
        
//        System.out.println(u1);
        
//        session.update(u2); // updation 
        
        ArrayList<Employee> list = (ArrayList)session.createQuery("From Employee").list();
        
        tx.commit();
        
        for (Employee emp : list){ 		// find all
        	System.out.println(emp);
        }
    }
}
