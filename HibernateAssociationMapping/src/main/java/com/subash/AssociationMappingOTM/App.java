package com.subash.AssociationMappingOTM;

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
    	Configuration cfg = new Configuration().configure("hibernate.cfg2.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Employee1 e1 = new Employee1();
        e1.setName("subash");
        
        Address ad1 = new Address();
        ad1.setCity("Madurai");
        
        Address ad2 = new Address();
        ad2.setCity("Usilampatti");
        
        List<Address> addr = new ArrayList<>();
        addr.add(ad1);
        addr.add(ad2);
        
        
        e1.setAddress(addr);
        
        
        session.save(e1);
        

        tx.commit();
    }
}
