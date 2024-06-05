package com.subash.HibernatePracticeProblem_Joined;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.subash.HibernatePracticeProblemTable_Per_Concrete.Tracker;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg2.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Trackers tr1 = new Trackers(500,"netaji","Soft");
		Java j = new Java(100,"subash","Software-engg",2,"JAVA","senathipathi");
		DotNet d = new DotNet(200,"subash","Software-engg",3,"Dotnet","senathipathi");
		Technical t = new Technical(300,"subash","Software-engg",4,"HTML");
		Behaviour b = new Behaviour(400,"subash","Software-engg",5,"HTML");

		
		
		session.save(tr1);
		session.save(j);
		session.save(d);
		session.save(t);
		session.save(b);
		
		tx.commit();
		
    }
}
