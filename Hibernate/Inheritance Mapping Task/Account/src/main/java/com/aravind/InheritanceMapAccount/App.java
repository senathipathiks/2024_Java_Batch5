package com.aravind.InheritanceMapAccount;

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
        
        Account a = new Account(1234,"RMColony");
        Current c = new Current(123,"RMColony",5000);
        Saving s = new Saving(12,"RMColony",10000,5000);
        
        session.save(a);
        session.save(c);
        session.save(s);
        tx.commit();
        
        
    }
}
