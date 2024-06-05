package com.ani.assocmaphiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop();
		e1.setName("ANI");
		e1.setLaptop(l1);
		
		l1.setName("Lenovo");
		l2.setName("HP");

		e2.setName("Kingsetha");
		e2.setLaptop(l2);

		session.save(e1);
		session.save(e2);

		tx.commit();
	}
}
