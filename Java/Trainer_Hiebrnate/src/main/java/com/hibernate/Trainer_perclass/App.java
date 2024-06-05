package com.hibernate.Trainer_perclass;

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
    	Configuration cfg = new Configuration().configure("trainer_perclass.cfg.xml");
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction(); 
    	
    	Trainer train = new Trainer(28,"Nagarjun","Developer");
    	Technical tech = new Technical(12,"Senathipathi","Trainer","Java");
    	Behavior b = new Behavior(10,"Rajesh","Behavioral Trainer","Forming Habits");
    	
    	session.save(b);
    	session.save(tech);
    	session.save(train);
    	
    	tx.commit();
    }
}
