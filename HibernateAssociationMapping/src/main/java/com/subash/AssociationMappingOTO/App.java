package com.subash.AssociationMappingOTO;

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
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Laptop laptop1 = new Laptop();
//        session.save(laptop1);
        
        Laptop laptop2 = new Laptop();
//        session.save(laptop2);
        
        Employee e1 = new Employee();
        e1.setName("SUBASH");
        e1.setLaptop(laptop1);
        
        Employee e2 = new Employee();
        e2.setName("UMESH");
        e2.setLaptop(laptop2);
        
        laptop1.setName("HP");
        laptop2.setName("ASUS");
        
        session.save(e1);
        session.save(e2);
       
        tx.commit();
    }
}
