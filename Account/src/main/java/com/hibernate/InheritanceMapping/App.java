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
        Account acc = new Account(12228,6379,"Vashanth TS","Indian Overseas Bank","Teppakulam");
        Savings save = new Savings(12229,9894,"Gokul Anand","Indian Bank","Palanganatham","Savings",4,500);
        Current curr = new Current(12230,7873,"Nandha","Punjab Bank","Ellis Nagar","Current",0,5000);
        
        session.save(acc);
        session.save(save);
        session.save(curr);
        
        tx.commit();


    }
}
