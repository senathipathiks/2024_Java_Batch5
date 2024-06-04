package com.gana.hibernateAccountTask;

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
        Account cp = new Account(12,"local","12");
        Savings b1 = new Savings(13,"international","132",89);
        Current b2 = new Current(22,"state","657",868);
        session.save(b2);
        session.save(b1);
        session.save(cp);
        tx.commit();
    }
}
