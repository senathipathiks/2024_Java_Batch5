package com.aravind.HQL;

import java.util.ArrayList;

import javax.persistence.Query;

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
		Transaction tx = session.beginTransaction();
		
//		Employee e = new Employee();
		
//		e.setName("Aravind");
//		e.setBatch(5);
//		
//		session.save(e);
//		tx.commit();
		
//From Clause
//		String hql = "From Employee";
//		Query query = session.createQuery(hql);
//		ArrayList<Employee> e = (ArrayList) query.getResultList();
//		
//		for(Employee emp : e) {
//			System.out.println(emp);
//		}
//		
//		String hql1 = "select name from Employee";
//		Query query1 = session.createQuery(hql1);
//		ArrayList<String> names = (ArrayList)query1.getResultList();
//		for(String name : names) {
//			System.out.println(name);
//		}
		
//		Employee1 e1 = new Employee1("Aravind",5);
//		Employee1 e2 = new Employee1("velan",5);
//		Employee1 e3 = new Employee1("vickee",1);
//		session.save(e1);
//		session.save(e2);
//		session.save(e3);
//		tx.commit();
		
		
//		String h2 = "insert into Employee (name,batch)"+"select name, batch from Employee1";
//		Query q = session.createQuery(h2);
//		q.executeUpdate();
//		tx.commit(); 
		
//		String h3 = "update Employee set name=?1 where id =?2";
//		Query q1 = session.createQuery(h3);
//		q1.setParameter(1, "Rajan");
//		q1.setParameter(2, 1);
//		
//		q1.executeUpdate();
//		tx.commit();
		
//		String h4 = "delete from Employee where id=?1";
//		Query q2 = session.createQuery(h4);
//		q2.setParameter(1, 1);
//		
//		q2.executeUpdate();
//		tx.commit();
		
		String h5 ="From Employee e order by e.id";
		Query q3 = session.createQuery(h5);
		ArrayList<Employee> emps = (ArrayList)q3.getResultList();
		for(Employee e : emps) {
			System.out.println(e);
		}
		
		String h6 = "From Employee e order by e.id desc";
		Query q4 = session.createQuery(h6);
		ArrayList<Employee> emp = (ArrayList)q4.getResultList();
		for(Employee e : emp) {
			System.out.println(e);
		}
		
		
		
    }
}
