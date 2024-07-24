package com.nandha.AssociateMapping;

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
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        
        e1.setName("Nandhakumaran");
        e1.setLaptop(l1);
        l1.setlName("HP");
        
        e2.setName("Jeeva");
        e2.setLaptop(l2);
        l2.setlName("DELL");
        
        s.save(e1);
        s.save(e2);
        tx.commit();
    }
}
