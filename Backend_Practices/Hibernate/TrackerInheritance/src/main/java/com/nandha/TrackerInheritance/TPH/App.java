package com.nandha.TrackerInheritance.TPH;

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
    	Configuration cfg =  new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx =  session.beginTransaction();
        
        Tracker track = new Tracker(1,"Nandhakumaran","Trainee");
        Technical tech = new Technical(2,"Ponraj","Trainee",80);
        Behavioral behave = new Behavioral(7,"Gokul","Trainee",90,"Rajesh","TrustWorthy");
    	
        JavaFS jfs = new JavaFS(111,"Jeeva","Trainee",95,"Spring","Sena");
        DotnetFS dfs = new DotnetFS(100,"Nagarjun","Trainee",90,"Collections","Sena");
        session.save(track);
        session.save(tech);
        session.save(behave);
        session.save(jfs);
        session.save(dfs);
        
        tx.commit();  
        }
}
