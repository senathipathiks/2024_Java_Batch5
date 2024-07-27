package Hibernate.HibernateEg7_3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("Account.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session =  sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Account acc = new Account (1001, "Akil", "Canara");
        Savings sav = new Savings (1002, "Bharath", "Axis", "Savings Account");
        Current cur = new Current (1003, "Catherine", "Indian", "Current Account");
        
        session.save(acc);
        session.save(sav);
        session.save(cur);
        
        tx.commit();
    }
}
