package com.hibernate.InheritanceSubClassMapping;

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
    	
    	Configuration cfg = new Configuration().configure("subclass.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx = session.beginTransaction();
    	Tracker tr = new Tracker(1,"Gokul","Trainee");
        Technical te = new Technical(2,"Vashanth","Trainee",80);
        Behavioral be = new Behavioral(75,"Nandha","Trainee",90,"Rajesh","EmailEtiquette");
        Java j = new Java(101,"Subash","Trainee",95,"Spring","Senapathi");
        Dotnet d = new Dotnet(100,"PonJothi","Trainee",90,"Collections","Anish");
        session.save(tr);
        session.save(te);
        session.save(be);
        session.save(j);
        session.save(d);
        
        tx.commit();

    }
}
