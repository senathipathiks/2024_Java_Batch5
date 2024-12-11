package com.spring.AssocMapping;

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
    	Configuration cfg =new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        
        e1.setName("Vashanth");
        e1.setLaptop(l1);
        e1.setCity("Madurai");
        l1.setName("HP Z Book");

       
        
        e2.setName("Arjun");
        e2.setLaptop(l2);
        e2.setCity("Sivagangai");
        l2.setName("Dell Horizon");

        
        
       
        
   
        
        
        s.save(e1);
        s.save(e2);
//        s.save(l1);
//        s.save(l2);
        
        tx.commit();
    }
}
