package com.supraja.JPA;

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
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
        EntityManager em=emf.createEntityManager();
       
//        Employee e=new Employee();
//        e.setName("Supraja");
//        e.setSalary("12223");
//        e.setDept("IT");
//        em.getTransaction().begin();
//        em.persist(e);
//        
//        em.getTransaction().commit();
//        
//        System.out.println("Inserted..");
        
//        String jpql="Update Employee set salary =:salary where id=:id";
//        em.getTransaction().begin();
//        Query q=em.createQuery(jpql);
//        q.setParameter("salary", "45678");
//        q.setParameter("id",1);
//        q.executeUpdate();
//        
//        em.getTransaction().commit();
//        
//        System.out.println("Inserted..");
        
        
//        Employee emp=em.find(Employee.class, 1);
//        em.getTransaction().begin();
//        
//        em.remove(emp);
//        em.getTransaction().commit();
//        
//        System.out.println("Deleted...");
        
        
//        Employee e1=em.createNamedQuery("findById",Employee.class).setParameter(1, 2).getSingleResult();
//        
//        System.out.println(e1);
        
        String nq="Select * from emp1 where id=:id";
        ArrayList<Object[]> a1=(ArrayList)em.createNativeQuery(nq).setParameter("id",2).getResultList();
        		
        		Object result[]=a1.get(0);
        		System.out.println(result[0]);
        		System.out.println(result[1]);
        		System.out.println(result[2]);
        		System.out.println(result[3]);
        
        
    }
}
