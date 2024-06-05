package com.ani.hibernateEx;

import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
//        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//        SessionFactory sf = cfg.buildSessionFactory();
//        Session session = sf.openSession();
//        Transaction tx=session.beginTransaction();
//        Employee e1= new Employee(124,"Aji","Tirunelveli");
//        session.save(e1);
//         tx.commit();
//        Employee e2 = session.find(Employee.class,123);
//        e2.setCity("Singapore");
//        session.update(e2);
//        System.out.println(e2);
//          session.delete(e2);
//          System.out.println(e2);
//          tx.commit();
//        ArrayList<Employee> list =(ArrayList)session.createQuery("From Employee").list();
//        for(Employee emp: list)
//        {
//        	System.out.println(emp);
//        }
    	
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx=session.beginTransaction();
    	Employee e1= new Employee(125,"vidhu","Madurai");
    	session.save(e1);
    	tx.commit();
        
    }
}
