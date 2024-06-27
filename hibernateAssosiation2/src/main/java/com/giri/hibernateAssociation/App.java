package com.giri.hibernateAssociation;

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
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Employee e1 = new Employee();
        e1.setName("Giri");
        
        Address ad1 = new Address();
        ad1.setCity("Madurai");
        
        Address ad2 = new Address();
        ad2.setCity("Usilampatti");
        
        List<Address> addr = new ArrayList<Address>();
        addr.add(ad1);
        addr.add(ad2);
        
        session.save(e1);
        session.save(ad1);
        session.save(ad2);
      tx.commit();
    }
}
