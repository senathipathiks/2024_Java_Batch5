package com.prabha.hibernate_ex;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
//		Configuration cfg = new Configuration().configure("hibernate.cfg.xml"); /// This is for CRUD
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
//// ------------------------> CRUD OPERATIONS<---------------------------------------------------
		
//// ---------------------Insertion-----------------
//		Student s1 = new Student(15, "Prabha", "Tirunelveli");
		Student s3 = new Student(16,"Dany","Tirunelveli");
		Student s2 = session.find(Student.class,15);
//		System.out.println(s2);
		
		Student s4 = new Student(17,"Surya","Tirunelveli");
//		session.save(s4);
		Student s5 = new Student(18,"dhinesh","Tirunelveli");
//		session.save(s5);

//		session.save(s1);
//		session.save(s3);

//// ---------------------Updation-------------------
//		s3.setSname("Daniel");
//		session.update(s3);
		
//// -----------------Deletion------------------------
//		session.delete(s5);
		
		
//// --------------------View All------------------------
//		ArrayList<Student> list = (ArrayList)session.createQuery("From Student").list();
//		for(Student st: list) {
//			System.out.println(st);
//		}
////-------------------------------> END OF CRUD OPERATIONS <------------------------------------------
		
		

		tx.commit();  //// It is common for all operations

	}
}
