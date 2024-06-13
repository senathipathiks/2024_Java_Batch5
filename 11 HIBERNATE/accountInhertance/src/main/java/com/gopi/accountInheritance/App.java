package com.gopi.accountInheritance;

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
        
        Account ac = new Account(1223324,"Savings","SBI","VNR");
        Savings sa = new Savings(1223342,"Savings","SBI","VNR",12000);
        Current cu = new Current(1223343,"Savings","SBI","VNR",14000);

        
        session.save(ac);
        session.save(sa);
        session.save(cu);
        tx.commit();
    }
}
