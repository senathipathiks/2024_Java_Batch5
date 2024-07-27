package com.hibernate.Vehicle_TblPerClass;

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
    	Configuration cfg = new Configuration().configure("Vehicle_PerClass.cfg.xml");
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();   
    	
    	Vehicle v = new Vehicle(1,"Nagarjun","25-Jul-2024");
    	TwoWheel two = new TwoWheel(2,"Arjun","25-Jul-2024","4S Champion",1994,"Petrol");
    	FourWheel four = new FourWheel(3,"Suresh","25-Dec-2024","Benz",2000,"Diesel");
    	
    	session.save(v);
    	session.save(two);
    	session.save(four);
    	
    	tx.commit();
    }
}
