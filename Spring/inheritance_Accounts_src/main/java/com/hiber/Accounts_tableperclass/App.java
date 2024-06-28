package com.hiber.Accounts_tableperclass;

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
    	Configuration cfg = new Configuration().configure("Accounts_TblPerClass.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        Account acc = new Account(12228,6379,"Nagarjun N S","Indian Overseas Bank","Teppakulam");
        Savings save = new Savings(12229,9894,"Gokul Anand","Indian Bank","Palanganatham","Savings",4,500);
        Current curr = new Current(12230,7873,"Nandha","Punjab Bank","Ellis Nagar","Current",0,5000);
        
        s.save(acc);
        s.save(save);
        s.save(curr);
        
        tx.commit();
    }
}
