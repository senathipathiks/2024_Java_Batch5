package com.madhan.hibernateaccount;

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
         Account a1 = new Account(12209,"Madhan.Sivakumar");
         Savings s = new Savings(12208,"Ram",8000);
         Current c = new Current(156,"Praba",10000);
         
         session.save(a1);
         session.save(s);
         session.save(c);
         
         tx.commit();
    }
}
