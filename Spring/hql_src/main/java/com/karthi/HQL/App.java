package com.karthi.HQL;

import java.util.ArrayList;

import javax.lang.model.element.Element;

import org.hibernate.Query;
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
		Transaction tx = session.beginTransaction();
		
//		String hql = "From Employee";
		String hql = "select e From Employee e";
//		String hql = "UPDATE Employee set name=?1 WHERE id=?2";
		
		Query query = session.createQuery(hql);	
//		query.setParameter(1, "Karthikeyan R K").setParameter(2, 3);
		
//		System.out.println(query.executeUpdate());
		ArrayList<Employee> al = (ArrayList) query.list();
		
		for (Employee id : al) {
			System.out.println(id);
		}
  }
}




//public class App 
//{
//    public static void main( String[] args )
//    {
//    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//		SessionFactory sf = cfg.buildSessionFactory();
//		Session session = sf.openSession();
//		Transaction tx = session.beginTransaction();
		
//		String hql = "From Employee";
//		String hql = "select e.name From Employee e";
//		String hql = "UPDATE Employee set name=?1 WHERE id=?2";
//		
//		Query query = session.createQuery(hql);	
//		
//		query.setParameter(1, "Karthikeyan R K").setParameter(2, 3);
//		
//		System.out.println(query.executeUpdate());
//		
//		tx.commit();
//		ArrayList<String> al = (ArrayList) query.list();
//		
//		for (String id : al) {
//			System.out.println(id);
//		}
//    }
//}
