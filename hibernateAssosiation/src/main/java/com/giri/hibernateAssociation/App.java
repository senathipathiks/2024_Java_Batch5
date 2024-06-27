package com.giri.hibernateAssociation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;
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
        Employee e1=new Employee();
        e1.setName("giri");
        
        List<Address> list = new ArrayList<Address>();
        
      
      session.save(e1);
      
      tx.commit();
    }
}
