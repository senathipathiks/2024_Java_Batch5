package com.srienath.hibernate;

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
//    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    	Student s1=new Student(123,"Srienath","Kerala");
    	session.save(s1);
    	Student s2=new Student(124,"Giri","Karnataka");
    	session.save(s2);
    	tx.commit();
    }
}
