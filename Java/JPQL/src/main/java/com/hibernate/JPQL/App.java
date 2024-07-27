package com.hibernate.JPQL;

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
//    	Inserting
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//        EntityManager em = emf.createEntityManager();
//      
//    	Employee emp = new Employee(12,"Madhavan",923874,"AI & DS");
//    	em.getTransaction().begin();
//    	
//    	em.merge(emp);
//    	
//    	em.getTransaction().commit();

    	
    	//Finding
//    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//    	EntityManager em = emf.createEntityManager();
//    	
//        Employee emp = em.find(Employee.class, 1);
//        
//        System.out.println(emp);
    	
//    	Updating method 1 (JPA Method)
//    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//    	EntityManager em = emf.createEntityManager();
//    	
//        Employee emp = em.find(Employee.class, 1);
//        emp.setSalary(8000);
//        em.getTransaction().begin();
//        em.merge(emp);
//        em.getTransaction().commit(); 
    	
//    	Updating Method 2(JPQL Method)
//    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//    	EntityManager em = emf.createEntityManager();
//    	
//    	String jpqlUpdateQuery = "Update Employee set salary= :sal where id=:id";
//    	em.getTransaction().begin();
//    	Query query = em.createQuery(jpqlUpdateQuery);
//    	query.setParameter("sal", 12345);
//    	query.setParameter("id", 1);
//    	query.executeUpdate();
//    	
//    	em.getTransaction().commit();
    	
    	
//    	Deleting JPA Method
//    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//    	EntityManager em = emf.createEntityManager();
//    	
//    	Employee emp = em.find(Employee.class, 1);
//    	em.getTransaction().begin();
//    	
//    	em.remove(emp);
//    	em.getTransaction().commit();
    	
    	
//    	Deleting JPQL Method
//    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//    	EntityManager em = emf.createEntityManager();
//    	
//    	String delq = "delete from Employee where id=:id";
//    	em.getTransaction().begin();
//    	Query q = em.createQuery(delq);
//    	q.setParameter("id",2);
//    	q.executeUpdate();
//    	em.getTransaction().commit();
    	
//    	Named Query
//    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//    	EntityManager em = emf.createEntityManager();
//    	
//    	Employee e = em.createNamedQuery("findbyid",Employee.class).setParameter(1, 3).getSingleResult();
//    	System.out.println(e);
    	
//    	Native Query
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	String nq = "select * from empjpql where id = :id";
    	ArrayList<Object[]> al = (ArrayList) em.createNativeQuery(nq).setParameter("id", 3).getResultList();
    	
    	Object res[] = al.get(0);
    	System.out.println(res[0]);
    	System.out.println(res[1]);
    	System.out.println(res[2]);
    	System.out.println(res[3]);
    }
}
