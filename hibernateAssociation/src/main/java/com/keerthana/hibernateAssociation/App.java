package com.keerthana.hibernateAssociation;

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
    	
    	        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
    	        SessionFactory sf=cfg.buildSessionFactory();
    	        Session session=sf.openSession();
    	        Transaction tx=session.beginTransaction();
    	        
    	        Employee e1=new Employee();
    	        Employee e2=new Employee();
    	        
   	        Laptop s1=new Laptop();
   	       Laptop s2=new Laptop();
   	       
   	       e1.setEname("Keerthy");
   	       e1.setLaptop(s1);
   	       s1.setName("Dell");
   	       
   	       
   	       e2.setEname("Sena");
   	       e2.setLaptop(s2);
   	       s2.setName("HP");
   	       
   	     session.save(e1);
   	  session.save(e2);
  	     session.save(s1);
 	   session.save(s2);
   	    tx.commit();
    }
}
