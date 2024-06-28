package com.karthi.JPQA;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Hello");
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//		EntityManager em = emf.createEntityManager();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		

//		String jpql = "Update Employee set salary = :sal where id = :id";
//		em.getTransaction().begin();
//		Query query = em.createQuery(jpql);
//		query.setParameter("sal", 52739);
//		query.setParameter("id", 3);
//		query.executeUpdate();
//		
//		em.getTransaction().commit();
		
//		Employee employee = em.find(Employee.class, 11);
//		em.getTransaction().begin();
//		
//		em.remove(employee);
//		em.getTransaction().commit();
		
//		Employee employee = em.createNamedQuery("findById", Employee.class).setParameter(1, 9).getSingleResult();
//		Employee employee = em.find(Employee.class, 3);
//		System.out.println(employee);
		
//		String nq = "Select * from employee where eid = :id";
//		ArrayList<Object[]> al = (ArrayList) em.createNativeQuery(nq).setParameter("id", 3).getResultList();
//		
//		Object result[] = al.get(0);
//		System.out.println(result[0]);
//		System.out.println(result[1]);
//		System.out.println(result[2]);
//		System.out.println(result[3]);
		
		Employee employee = new Employee();
		employee.setName("Abishek");
		employee.setSalary(47200);
		employee.setDept("cse");
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
	}
}
