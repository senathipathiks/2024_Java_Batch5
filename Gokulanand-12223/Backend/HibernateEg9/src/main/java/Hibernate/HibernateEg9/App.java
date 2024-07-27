package Hibernate.HibernateEg9;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("Trainer.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session =  sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Trainer tr = new Trainer(1, "Senathipathi", "50");
        Technical tl = new Technical(2, "Valan", "51", "Arasu", "Java");
        Behaviour br = new Behaviour(3, "Anish", "52", "Pandian", "dotnet");
        
        session.save(tr);
        session.save(tl);
        session.save(br);
        
        tx.commit();
        
    }
}
