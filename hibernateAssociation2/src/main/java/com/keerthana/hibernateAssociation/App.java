package com.keerthana.hibernateAssociation;

import java.util.ArrayList;
import java.util.List;

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
    	        
    	        
//    	        Employee e1=new Employee();
//    	      
//    	        List<Address> list=new ArrayList<Address>();
//    	        
//   	        Address s1=new Address();
//   	       Address s2=new Address();
//   	       
//   	       e1.setEname("Giri");
//   	      
//   	       s1.setCity("Madurai");
//   	       s2.setCity("viruthunagar");
//   	       
//   	       list.add(s2);
//   	       list.add(s1);
//   	       
//   	       e1.setAddress(list);
   	       
   	       
   	    Employee e2=new Employee();
   	    
   	    List<Address> list=new ArrayList<Address>();
   	    
   	    Address ad1=new Address();
   	    Address ad2=new Address();
   	    
   	    e2.setEname("Sanjai");
   	    ad1.setCity("Chennai");
   	    ad2.setCity("Florida");
   	    list.add(ad1);
   	    list.add(ad2);
   	     e2.setAddress(list);
   	     
   	       
   	     session.save(e2);
   	  
   	    tx.commit();
    }
}
