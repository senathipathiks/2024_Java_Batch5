package com.gana.hibernateinheritance3;

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
        CricketPlayer cp = new CricketPlayer(12,"Virat Kohli","India");
        Batsman b1 = new Batsman(19,"KL Rahul","India",10000);
        Bowler b2 = new Bowler(33,"Jofra Archer","England",2000);
        session.save(b2);
        session.save(b1);
        session.save(cp);
        tx.commit();
    }
}
