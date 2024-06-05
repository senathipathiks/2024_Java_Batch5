package com.hibernate.InheritanceTableClassMapping;

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
    	
    	Configuration cfg = new Configuration().configure("tableperclass.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx = session.beginTransaction();
        Account acc = new Account(12228,6379,"Nagarjun N S","Indian Overseas Bank","Teppakulam");
        Savings save = new Savings(12229,9894,"Vashanth TS","Indian Bank","Palanganatham","Savings",4,500);
        Current curr = new Current(12230,7873,"Nandha","Punjab Bank","Ellis Nagar","Current",0,5000);
        
        session.save(acc);
        session.save(save);
        session.save(curr);
        
        tx.commit();


    }
}
