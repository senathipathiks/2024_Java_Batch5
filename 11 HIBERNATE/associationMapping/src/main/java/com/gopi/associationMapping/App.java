package com.gopi.associationMapping;



import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import antlr.collections.List;



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
        
        Employee e1 = new Employee();
        
        e1.setName("Gopi");
        
        java.util.List<Address> list = new ArrayList<Address>();
        
        Address add1 = new Address();
        Address add2 = new Address();
        
        add1.setCity("Coimbatore");
        add2.setCity("Virudhunagar");

        list.add(add1);
        list.add(add2);
        
        e1.setAddress(list);
        session.save(e1);

        
        tx.commit();
        
    }
}
