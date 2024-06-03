package com.aravind.HibernateAnnotation;

import org.hibernate.cfg.Configuration;

import org.hibernate.Transaction;

import java.util.ArrayList;


import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

//        Student s1 = new Student(2222, "velan","dindigul");
//        session.save(s1);
//        tx.commit();

		
        Student s2 = new Student(2206,"vickee","kovilpatti");
        session.save(s2);
        tx.commit();

		
//       	  Student s2 = session.find(Student.class, 2219);
//       	  System.out.println(s2);

		
//		Student s2 = session.find(Student.class, 2219);
//		s2.setCity("Virudhunagar");
//		session.update(s2);
//		tx.commit();
//		System.out.println(s2);

		
//		Student s2 = session.find(Student.class, 2219);
//		session.delete(s2);
//		tx.commit();
//		System.out.println(s2);
		
//		ArrayList<Student> list = (ArrayList)session.createQuery("From Student").list();
//		for(Student s : list) {
//			System.out.println(s);
//		}
//		

	}
}
