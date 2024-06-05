package com.raj.InheritanceMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg =  new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx =  session.beginTransaction();
        
        Tracker tr = new Tracker(101,"Gokul","Trainee");
        Technical te = new Technical(201,"raj","Trainee",80);
        Behavioral be = new Behavioral(57,"GOkul","Trainee",90,"Rajesh","TrustWorthy");
    	
        Java j = new Java(19,"Subash","Trainee",95,"Spring","Sena");
        Dotnet d = new Dotnet(21,"Raju","Trainee",90,"Collections","Anish");
        
        session.save(tr);
        session.save(te);
        session.save(be);
        session.save(j);
        session.save(d);
        
        tx.commit();
        
    }
}
