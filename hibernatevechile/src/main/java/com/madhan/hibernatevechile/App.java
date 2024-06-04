package com.madhan.hibernatevechile;

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
    	Configuration cfg = new Configuration ().configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Vechile v = new Vechile(40467,"Bajaj");
        Twowheeler tw = new Twowheeler(160000,"Pulsar 150");
        Fourwheeler fw = new Fourwheeler(950000,"Fronx");
        
        session.save(v);
        session.save(tw);
        session.save(fw);
        
        tx.commit();
        
    }
}
