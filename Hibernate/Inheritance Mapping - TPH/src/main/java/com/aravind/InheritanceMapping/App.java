package com.aravind.InheritanceMapping;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        CricketPlayer cp = new CricketPlayer(40,"Pathirana","Srilanka");
        Batsman b1 = new Batsman(7,"MSD","India",10000);
        Bowler b2 = new Bowler(18,"Aravind","India",500);
        session.save(cp);
        session.save(b1);
        session.save(b2);
        tx.commit();
    }
}
