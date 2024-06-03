package com.aravind.InheritanceMapVehicle;

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
        
        Vehicle v = new Vehicle(101,"yamaha");
        TwoWheeler t = new TwoWheeler(100,"yamaha","R1","200000");
        FourWheeler f = new FourWheeler(102,"Toyota","Fortuner","500000");
        
        session.save(v);
        session.save(t);
        session.save(f);
        
        tx.commit();
    }
}
