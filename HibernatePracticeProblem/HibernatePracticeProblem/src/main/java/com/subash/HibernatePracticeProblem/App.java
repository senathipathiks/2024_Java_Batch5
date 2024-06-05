package com.subash.HibernatePracticeProblem;

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

		
//		Java j = new Java(1,"subash","Software-engg",2,"JAVA");
		Technical t = new Technical(2,"subash","Software-engg",2,"HTML");
		
		
		
		session.save(t);
//		session.save(b1);
//		session.save(b2);
		tx.commit();
		
    }
}
