package com.gopi.vehicleInheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        Vehicle vc = new Vehicle(122,20000,"GS");
        TwoWheeler tw = new TwoWheeler(132,300000,"Siva",25,"Ducati");
        FourWheeler fw = new FourWheeler(142,300000,"Gopi",10,"Bucati");

        
        session.save(vc);
        session.save(tw);
        session.save(fw);
        tx.commit();
    }
}
