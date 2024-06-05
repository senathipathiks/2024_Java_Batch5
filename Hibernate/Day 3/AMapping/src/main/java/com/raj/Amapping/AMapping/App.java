package com.raj.Amapping.AMapping;

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
        
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        
        e1.setName("Raj");
        e1.setLaptop(l1);
        l1.setName("Dell");
        
        e2.setName("Raj");
        e2.setLaptop(l2);
        l2.setName("Hp");
        
        session.save(e1);
        session.save(e2);
        
        tx.commit();
        
    }
}
