package com.keerthana.hibernate2;

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
    	
    	        Configuration cfg=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
    	        SessionFactory sf=cfg.buildSessionFactory();
    	        Session session=sf.openSession();
    	        Transaction tx=session.beginTransaction();
   	        Employee s1=new Employee(12227,"Keerthana","Madurai");
   	      session.save(s1);
   	    tx.commit();
    }
}
