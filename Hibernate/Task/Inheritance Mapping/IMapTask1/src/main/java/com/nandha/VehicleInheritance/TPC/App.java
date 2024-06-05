package com.nandha.VehicleInheritance.TPC;

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
    	
    	Vehicle veh = new Vehicle(1, "Audi", "A3", "2020");
    	
    	FourWheeler four = new FourWheeler(222, "Mercedez Benz", "Classic","2001", "10km", "Diesel and Petrol", "Manual and Automatic" );
    	TwoWheeler two = new TwoWheeler(333, "Yamaha", "FZ-X", "2018", "Petrol","19KM");
    	
    	session.save(veh);
    	session.save(four);
    	session.save(two);
    
    	tx.commit();
    }
}
