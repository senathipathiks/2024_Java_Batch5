package com.supraja.HibernateAssociOnetoMany;

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
    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	Employee e1=new Employee();
    	
        List<Address> list=new ArrayList<Address>();
        Address ad1=new Address();
        Address ad2=new Address();
        
        e1.setEname("Supraja");
        ad1.setCity("Madurai");
        ad2.setCity("Chennai");
        list.add(ad1);
        list.add(ad2);
        e1.setAddress(list);
        session.save(e1);
        
        tx.commit();
    }
}
