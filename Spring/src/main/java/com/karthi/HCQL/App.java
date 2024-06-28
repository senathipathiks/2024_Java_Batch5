package com.karthi.HCQL;

import java.util.ArrayList;

import javax.persistence.NamedQuery;
import javax.persistence.QueryHint;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.data.jpa.repository.Query;

/**
 * Hello world!
 *
 */


//public class App {
//	public static void main(String[] args) {
//		System.out.println("Hello");
//	}
//}










public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Criteria c = session.createCriteria(Employee.class);
		
		
		c.setProjection(Projections.property("name"));
		c.addOrder(Order.asc("name"));
		
		
		ArrayList<String> names = (ArrayList) c.list();
		
		for (String name : names) {
			System.out.println(name);
		}
		
//		c.add(Restrictions.ge("salary", 10000));
//		c.addOrder(Order.asc("name"));
		
//		c.setProjection(Projections.property("name"));
//		c.add(Restrictions.like("name", "a%"));

		
//		for (Employee employee : list) {
//			System.out.println(employee);
//		}
//		
//		System.out.println(c.setProjection(Projections.rowCount()).uniqueResult());
	}
}
