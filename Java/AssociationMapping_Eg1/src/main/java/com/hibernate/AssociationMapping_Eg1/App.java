package com.hibernate.AssociationMapping_Eg1;

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
        Configuration cfg =new Configuration().configure("Association_map_eg1.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        
        e1.setName("Nagarjun");
        e1.setCity("Madurai");
        e1.setLaptop(l1);
        l1.setName("HP Z Book");
        
        e2.setName("Arjun");
        e2.setCity("Chennai");
        e2.setLaptop(l2);
        l2.setName("Dell Horizon");

        s.save(e1);
        s.save(e2);
        	
        tx.commit();
    }
}
