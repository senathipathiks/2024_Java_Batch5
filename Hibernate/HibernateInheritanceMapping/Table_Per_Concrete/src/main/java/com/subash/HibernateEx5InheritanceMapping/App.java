package com.subash.HibernateEx5InheritanceMapping;

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
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(CricketPlayer.class).addAnnotatedClass(Batsman.class).addAnnotatedClass(Bowler.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		CricketPlayer cp = new CricketPlayer(111,"murali","srilanka"); //cricket player is a base class
		Batsman b1 = new Batsman(211,"Arun","India",1000);
		Bowler b2 = new Bowler(311,"Kumar","Srilanka",500);
		session.save(cp);
		session.save(b1);
		session.save(b2);
		tx.commit();
	}
}