package com.srienath.HibernateTableJoined;



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
    	Configuration cfg=new Configuration().configure("hibernate.cfg2.xml");
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session=sf.openSession();
    	
    	Transaction tx=session.beginTransaction();
    	Tracker tr = new Tracker(201,"Kevin","Manager");
    	Technical t1=new Technical(202,"Ranga","HR",202,"Java");
    	Behaviour b1=new Behaviour(303,"Amban","Intern",305,"Fafa");
    	Java j1=new Java(305,"Giri","Peon",555,"Java",11,"Ancelotti");
    	Dotnet d1=new Dotnet(310,"Madhan","Junior",333,"Dotnet",10,"Subash");

    	session.save(tr);
    	session.save(t1);
    	session.save(b1);
    	session.save(j1);
    	session.save(d1);
    	tx.commit();
    }
}
