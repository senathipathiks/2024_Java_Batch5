package com.ani.hiberInheriEx1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx=session.beginTransaction();
    	Account ac=new Account(112,"ANI","Valiior");
    	Savings sv=new Savings(134,"VICKY","Kovilpatti",12340);
    	Current cc=new Current(19072,"AJI","Valiior",1222280);
    	session.save(ac);
    	session.save(sv);
    	session.save(cc);
    	tx.commit();
    	
    }
}
