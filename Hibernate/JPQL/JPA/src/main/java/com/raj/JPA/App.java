package com.raj.JPA;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager(); 
    	
    	//Add
//    	Employee e = new Employee(12,"Raj",50000,"IT");
//    	em.getTransaction().begin();	
//    	em.merge(e);
//    	em.getTransaction().commit();
    	
    	//Find
//    	Employee e = em.find(Employee.class,2);
//    	System.out.println(e);
    	
    	//Update
//    	Employee e = em.find(Employee.class,1);
//    	e.setSalary(7000);
//    	em.getTransaction().begin();
//    	em.merge(e);
//    	em.getTransaction().commit();
//    	System.out.println(e);
    	
    	
    	//ANOTHER METHOD FOR UPDATE
//    	String jpql = "Update Employee set esalary = :sal where eid=:id";
//    	em.getTransaction().begin();
//    	Query query = em.createQuery(jpql);
//    	query.setParameter("sal", 12345);
//    	query.setParameter("id", 1);
//    	query.executeUpdate();
//    	
//    	em.getTransaction().commit();
    	
    	
    	// REMOVE
//    	Employee e = em.find(Employee.class,1);
//    	em.getTransaction().begin();
//    	
//    	em.remove(e);
//    	em.getTransaction().commit();
    	
    	// Named Query
//    	Employee e = em.createNamedQuery("findById", Employee.class).setParameter(1, 2).getSingleResult();
//    	System.out.println(e);
    	
    	// Native Query
    	String nq = "Select * from emp where eid = :id";
    	ArrayList<Object[]>al = (ArrayList) em.createNativeQuery(nq).setParameter("id", 2).getResultList();
    	
    	Object result[] = al.get(0);
    	System.out.println(result[0]);
    	System.out.println(result[1]);
    	System.out.println(result[2]);
    	System.out.println(result[3]);
    
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
