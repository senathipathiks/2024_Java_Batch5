package com.ani.assocmaphiber2;

import java.util.ArrayList;
import java.util.List;

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
		e1.setName("Ani");

		List<Address> list1 = new ArrayList<Address>();
		Address add1 = new Address();
		Address add2 = new Address();

		add1.setCity("Tirunelveli");
		add2.setCity("Singapore");

		list1.add(add1);
		list1.add(add2);

		e1.setAddress(list1);

		session.save(e1);

		tx.commit();
	}
}
