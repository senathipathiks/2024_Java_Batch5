package com.hibernate.InheritanceSubClassMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.jdbc.BatchedTooManyRowsAffectedException;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("subclass.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx = session.beginTransaction();
        Vehicle cp= new Vehicle(01,"Bajaj","Pulsar");
        TwoWheeler v1=new TwoWheeler(02,"Yamaha","Fz-x","Gear",24);
        FourWheeler  v2=new FourWheeler(03,"Audi","A8",40,"Petrol","AMT+");
        session.save(cp);
        session.save(v1);
        session.save(v2);
        tx.commit();
    }
}
