package com.hiber.hiber_Inheritance_Table_perclass;

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
         
         CricketPlayer cp = new CricketPlayer(15,"Pathirana","Sri Lanka","21 years");
         
         Batsman b1 = new Batsman(8,"Dhoni","India","35 years",1000);
         Bowler b2 = new Bowler(991,"Ashwin","India","32 Years",700);
         
         s.save(cp);
         s.save(b1);
         s.save(b2);
         
         tx.commit();
    }
}
