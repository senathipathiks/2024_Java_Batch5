package com.supraja.HiberInheritance;

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
    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	CricketPlayer cp=new CricketPlayer(27,"Murali","England");
    	Batsman b1=new Batsman(12,"Venkat","India",1000);
    	Bowler b2=new Bowler(14,"Prasath","England",400);
    	session.save(cp);
    	session.save(b1);
    	session.save(b2);
    	//System.out.println("No error");
    	tx.commit();
    }
}
