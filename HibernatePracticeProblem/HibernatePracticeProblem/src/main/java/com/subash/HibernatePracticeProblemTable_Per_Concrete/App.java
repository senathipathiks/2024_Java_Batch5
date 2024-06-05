package com.subash.HibernatePracticeProblemTable_Per_Concrete;

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

		
//		Java j = new Java(100,"subash","Software-engg",2,"JAVA","senathipathi");
//		DotNet d = new DotNet(200,"subash","Software-engg",2,"Dotnet","senathipathi");
//		Technical t = new Technical(300,"subash","Software-engg",2,"HTML");
//		Behaviour b = new Behaviour(400,"subash","Software-engg",2,"HTML");
		Tracker tr = new Tracker(500,"subash","Software-engg");
		
//		session.save(j);
//		session.save(d);
//		session.save(t);
//		session.save(b);
		session.save(tr);
		tx.commit();
		
    }
}
