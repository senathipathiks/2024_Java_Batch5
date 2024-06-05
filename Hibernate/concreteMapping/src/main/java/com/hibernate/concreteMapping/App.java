package com.hibernate.concreteMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.concreteMapping.Batsman;
import com.hibernate.concreteMapping.Bowler;
import com.hibernate.concreteMapping.CricketPlayer;

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
    	CricketPlayer cp =new CricketPlayer(1,"Dhoni","India");
    	Batsman bm1 = new Batsman(11,"smith","australia",1000);
    	Bowler bw1 =new Bowler(04,"ash","india",500);
    	session.save(cp);
    	session.save(bm1);
    	session.save(bw1);
    	tx.commit();
    }
}

