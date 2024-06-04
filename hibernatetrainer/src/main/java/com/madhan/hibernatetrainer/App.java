package com.madhan.hibernatetrainer;

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
        Trainer t = new Trainer(49,"Sena","Eight years");
        Technical t2 = new Technical(690, "B.E-CSE","Java");
        Behavior b = new Behavior(800, "BBA","Behavior");
        Java j = new Java(86, "a", "f", "f", "r");
        Dotnet dn = new Dotnet(73, "r", "y");
        
        session.save(t);
        session.save(t2);
        session.save(b);
        session.save(j);
        session.save(dn);
        
        tx.commit();
        
        
    }
}
