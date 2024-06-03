package com.aravind.InheritanceMapTraineer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration con = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Trainner t = new Trainner(201,"Sena","Coimbatore");
        Technical tec = new Technical(202,"Anish","Kerala","MBA","FullstackDeveloper");
        Behaviour b = new Behaviour(203,"Rajesh","Madurai","B.sc","Behaviour");
        Java j = new Java(204,"sena","com","B.E","Fullstack","Springboot");
        Dotnet d = new Dotnet(205,"Gowtham","Dindigul","B.E","Framework","Manager");
        
        session.save(t);
        session.save(tec);
        session.save(b);
        session.save(j);
        session.save(d);
        
        tx.commit();
    }
}
