package com.aravind.HCQL;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import antlr.collections.List;




public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg2.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
//		Employee e = new Employee();
//		Employee e1 = new Employee();
//		Employee e2 = new Employee();
		
//		e.setName("aravind");
//		e.setSal(20000);
//		e.setDep("cse");
//		session.save(e);
		
//		e1.setName("raj");
//		e1.setSal(30000);
//		e1.setDep("aids");
//		
//	
//		
//		e2.setName("velan");
//		e2.setSal(30000);
//		e2.setDep("IT");
//		
//		session.save(e1);
//		session.save(e2);
//		tx.commit();

		
		
		Criteria c = session.createCriteria(Employee.class);
		

		c.add(Restrictions.gt("sal",1000.0f));	
		ArrayList<Employee> em = (ArrayList) c.list();
		
		for(Employee emp : em) {
			System.out.println(emp);
		}
		
		
//		c.setProjection(Projections.property("name"));  
//		c.addOrder(Order.desc("name"));
//		ArrayList<String> emp = (ArrayList) c.list();
//		for(String s : emp) {
//			System.out.println(s);
//		}
		
		
		
		
		
		


		
		
    }
}
