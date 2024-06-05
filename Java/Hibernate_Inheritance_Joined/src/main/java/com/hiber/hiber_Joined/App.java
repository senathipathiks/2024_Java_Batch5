package com.hiber.hiber_Joined;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	 Configuration cfg = new Configuration().configure("InheritanceMapping.cfg.xml");
         SessionFactory sf = cfg.buildSessionFactory();
         Session s = sf.openSession();
         Transaction tx = s.beginTransaction();
         
         CricketPlayer cp = new CricketPlayer(8,"Jadeja","India","31 years");
         
         Batsman b1 = new Batsman(13,"Faf Du Plessis","South Africa","35 years",10000);
         Bowler b2 = new Bowler(32,"Tushar Deshpande","India","28 Years",700);
         
         s.save(cp);
         s.save(b1);
         s.save(b2);
         
         tx.commit();
    }
}
