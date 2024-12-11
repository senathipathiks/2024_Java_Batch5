package com.hibernate.InheritanceMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.jdbc.BatchedTooManyRowsAffectedException;


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
        Session session =sf.openSession();
        Transaction tx = session.beginTransaction();
    	Tracker tr = new Tracker(1,"Gokul","Trainee");
        Technical te = new Technical(2,"raj","Trainee",80);
        Behavioral be = new Behavioral(75,"GOkul","Trainee",90,"Rajesh","TrustWorthy");
        Java j = new Java(101,"Subash","Trainee",95,"Spring","Sena");
        Dotnet d = new Dotnet(100,"Raju","Trainee",90,"Collections","Anish");
        session.save(tr);
        session.save(te);
        session.save(be);
        session.save(j);
        session.save(d);
        
        tx.commit();

    }
}
