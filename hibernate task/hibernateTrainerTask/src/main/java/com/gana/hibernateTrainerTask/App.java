package com.gana.hibernateTrainerTask;

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
        Trainer tr = new Trainer(12272,"gowtham","dindigul");
        Technical t1 = new Technical(12242,"sena","coimbatore","BE","Java");
        Behavioural t2 = new Behavioural(12243,"rajesh","madurai","MBA","Communication");
        Java t3 = new Java(647,"sonam","natham","it","hibernate",23);
        Dotnet t4 = new Dotnet(8678,"jithu","bihar","BBA","Dotnet",76);
        session.save(t2);
        session.save(t1);
        session.save(t3);
        session.save(t4);
        session.save(tr);
        tx.commit();
    }
}
