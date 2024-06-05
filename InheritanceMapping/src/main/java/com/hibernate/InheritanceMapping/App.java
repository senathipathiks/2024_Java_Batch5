package com.hibernate.InheritanceMapping;

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
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx = session.beginTransaction();
        CricketPlayer cp= new CricketPlayer(44,"VirendarShewagh","India");
        Batsman b1=new Batsman(18,"Virat","India",10000);
        Bowler  b2=new Bowler(8,"DaleStyen","SA",9000);
        session.save(cp);
        session.save(b1);
        session.save(b2);
        tx.commit();
    }
}
