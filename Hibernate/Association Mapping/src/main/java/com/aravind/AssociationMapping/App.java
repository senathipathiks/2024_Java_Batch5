package com.aravind.AssociationMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration con = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        
        e1.setName("Aravind");
        l1.setName("Lenova");
        e1.setLaptop(l1);
        
        e2.setName("Ashwin");
        l2.setName("HP");
        e2.setLaptop(l2);
        
        session.save(e1);
        session.save(e2);
        
        tx.commit();
        

    }
}
