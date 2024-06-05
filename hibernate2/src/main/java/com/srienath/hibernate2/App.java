package com.srienath.hibernate2;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


// Create Column in Table
//public class App 
//{
//    public static void main( String[] args )
//    {
//    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
//    	SessionFactory sf=cfg.buildSessionFactory();
//    	Session session=sf.openSession();
//    	Transaction tx=session.beginTransaction();
////    	Cricket c1=new Cricket(7,"Srienath","CSK");
//    	Cricket c2=new Cricket(9,"Giri","RCB");
//    	Cricket c3=new Cricket(11,"Ganapathy","LSG");
//    	Cricket c4=new Cricket(12,"Ponraj","CSK");
////    	session.save(c1);
//    	session.save(c2);
//    	session.save(c3);
//    	session.save(c4);
//
//    	tx.commit();
//    }
//}

// Update Column in Table
//public class App 
//{
//    public static void main( String[] args )
//    {
//    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
//    	SessionFactory sf=cfg.buildSessionFactory();
//    	Session session=sf.openSession();
//    	Transaction tx=session.beginTransaction();
//    	Cricket c1=session.find(Cricket.class,7);
//    	c1.setName("Dhoni");
//    	session.update(c1);
//		System.out.println(c1);

//    	tx.commit();
//    }
//}

//Displaying all table data of cricket class through array class
//public class App 
//{
//    public static void main( String[] args )
//    {
//    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
//    	SessionFactory sf=cfg.buildSessionFactory();
//    	Session session=sf.openSession();
//    	Transaction tx=session.beginTransaction();
////    	Cricket c1=session.find(Cricket.class,7);
////    	c1.setName("Dhoni");
////    	session.update(c1);
////    	System.out.println(c1);
//    	
//    	ArrayList<Cricket> list=(ArrayList)session.createQuery("From Cricket").list();
////    	tx.commit();
//    	for(Cricket cricket : list) {
//    		System.out.println(cricket);
//    	}
//    }
//}

//Delete command
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
//    	Cricket c1=session.find(Cricket.class,7);
//    	c1.setName("Dhoni");
//    	session.update(c1);
//    	System.out.println(c1);
    	
    	Cricket c1 = session.find(Cricket.class, 12);  //find
        if(c1 !=null) {
        	session.delete(c1);            // delete
        	System.out.println("record delete");
        } else {
        	System.out.println("No records found");
        }
        tx.commit();

    }
}
