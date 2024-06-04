package com.prabha.hiberInheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		CricketPlayer cp = new CricketPlayer(15,"Natrajan","India");
		Batsman b1 = new Batsman(12,"Bravo","South Africa",1000);
		Bowler b2 = new Bowler(16,"Watson","Australia",1000);
		session.save(cp);
		session.save(b1);
		session.save(b2);
		tx.commit();
		
	}
}
