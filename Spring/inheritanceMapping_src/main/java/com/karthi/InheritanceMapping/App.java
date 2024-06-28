package com.karthi.InheritanceMapping;

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
//        System.out.println( "Hello World!" );
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		CricketPlayer cp = new CricketPlayer(1, "Dinesh", "India");
		Batsman bt = new Batsman(2, "Karthi", "India", 234123);
		Bowler bw = new Bowler(3, "RK", "New Zealand", 231);
		
		session.save(cp);
		session.save(bt);
		session.save(bw);
		tx.commit();
    }
}
