package com.prabha.table_per_subclass;

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

		Configuration cfg = new Configuration().configure("hibernate2.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		CricketPlayer cp1 = new CricketPlayer(1111,"Natrajan","India");
		Batsman b3 = new Batsman(1112,"Bravo","South Africa",1000);
		Bowler b4 = new Bowler(1116,"Watson","Australia",1000);
		session.save(cp1);
		session.save(b3);
		session.save(b4);
		tx.commit();
		
	}
}
