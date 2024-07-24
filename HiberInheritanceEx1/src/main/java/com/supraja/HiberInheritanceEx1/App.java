package com.supraja.HiberInheritanceEx1;

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
    	
    	Tracker t=new Tracker(12,"Supraja","SE");
    	Technical t1=new Technical(12224,"java","L&D",3,"java");
    	Behavioral t2=new Behavioral(123,"Dhars","UX",7,"communication");
    	Java j=new Java(234,"Venk","Manager",67,"java",45,"Servlet");
    	Dotnet d=new Dotnet(543,"Chitra","Developer",34,"Dotnet",45,"API");
    	session.save(t);
    	session.save(t1);
    	session.save(t2);
    	session.save(j);
    	session.save(d);
    	tx.commit();
    }
}
