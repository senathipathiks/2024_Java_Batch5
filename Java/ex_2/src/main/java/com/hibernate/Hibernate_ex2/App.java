package com.hibernate.Hibernate_ex2;

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
        Configuration cfg = new Configuration().configure("Cake.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
//        Insertion
//        Cake cake = new Cake(12,750,"Choco Truffle","Happy Birthday Vashanth","10 Kg","White Truffle");
//        s.save(cake);
//        tx.commit();
//        System.out.println(cake);
        
//        Finding
        Cake c = new Cake(12,750,"Choco Truffle","Happy Birthday Vashanth","10 Kg","White Truffle");
        s.save(c);
        tx.commit();
        
    }
}
