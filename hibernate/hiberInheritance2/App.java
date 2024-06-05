package com.ani.hiberInheritance2;

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
    	Transaction tx=session.beginTransaction();
    	CricketPlayer cp = new CricketPlayer(149,"Vicky","Africa");
    	Batsman b1=new Batsman(161,"Aji","India",100);
    	Bowler b2=new Bowler(182,"Vellu","Srilanka",500);
    	session.save(cp);
    	session.save(b1);
    	session.save(b2);
    	tx.commit();
    	
    }
}
