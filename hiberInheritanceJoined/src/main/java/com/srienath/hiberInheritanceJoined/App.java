package com.srienath.hiberInheritanceJoined;

import java.util.ArrayList;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.srienath.hiberInheritanceJoined.CricketPlayer;

/**
 * Table Per Class
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session=sf.openSession();
    	CricketPlayer cp = new CricketPlayer(17,"Kevin","England");
    	Transaction tx=session.beginTransaction();
    	Batsman b1=new Batsman(1,"Ranga","India",9999);
    	Bowler b2=new Bowler(2,"Amban","West Indies",101);
    	session.save(cp);
    	session.save(b1);
    	session.save(b2);
    	tx.commit();
    	ArrayList<CricketPlayer> list=(ArrayList)session.createQuery("From CricketPlayer").list();
    	for(CricketPlayer cricket : list) {
    		System.out.println(cricket);
    	}

    }
}
