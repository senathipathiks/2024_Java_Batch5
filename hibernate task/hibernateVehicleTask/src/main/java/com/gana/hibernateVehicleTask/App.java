package com.gana.hibernateVehicleTask;

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
        Vehicle cp = new Vehicle(22,"fz","2470");
        TwoWheeler b1 = new TwoWheeler(13,"duke","92",20);
        FourWheeler b2 = new FourWheeler(58,"re","6438",28);
        session.save(b2);
        session.save(b1);
        session.save(cp);
        tx.commit();
    }
}
