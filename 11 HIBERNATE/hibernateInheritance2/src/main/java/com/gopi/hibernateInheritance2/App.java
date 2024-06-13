package com.gopi.hibernateInheritance2;

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
        
        CricketPlayer cp = new CricketPlayer(1,"GS","India");
        Batsman b1 = new Batsman(2,"Gopi","India",125);
        Bowler b2 = new Bowler(3,"Siva","India",20);
        
        session.save(cp);
        session.save(b1);
        session.save(b2);
        tx.commit();
    }
}
