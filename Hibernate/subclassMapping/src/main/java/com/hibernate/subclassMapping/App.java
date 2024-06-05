package com.hibernate.subclassMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.subclassMapping.Batsman;
import com.hibernate.subclassMapping.Bowler;
import com.hibernate.subclassMapping.CricketPlayer;

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
    	CricketPlayer cp =new CricketPlayer(211,"hardik","India");
    	Batsman bm1 = new Batsman(311,"sam","england",1000);
    	Bowler bw1 =new Bowler(131,"pathirana","srilanka",500);
    	session.save(cp);
    	session.save(bm1);
    	session.save(bw1);
    	tx.commit();
    }
}
