package com.keerthana.jpa;

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
//        e.setName("giri");
//        e.setSalary("90000");
//        e.setDept("cse");
//        em.getTransaction().begin();
//        
//        em.persist(e);
        
//        Employee e=em.find(Employee.class, 2);
//        e.setSalary("20000");
//        em.getTransaction().begin();
//        em.merge(e);
//        em.getTransaction().commit();
//        System.out.println("inserted");
        
//        String jpql="Update Employee set salary =:salary where id=:id";
//        		em.getTransaction().begin();
//        Query q=em.createQuery(jpql);
//        q.setParameter("salary", "77777");
//        q.setParameter("id", 2);
//        q.executeUpdate();
        
//        Employee e=em.find(Employee.class, 1);
//        em.getTransaction().begin();
//        em.remove(e);
//        
//        em.getTransaction().commit();
//        System.out.println("inserted");
        
        
//        Employee e=em.createNamedQuery("findById",Employee.class).setParameter(1, 3).getSingleResult();
//        System.out.println(e);
        
        String nq="Select * from emp1 where id= :id";
        ArrayList<Object[]> al=(ArrayList) em.createNativeQuery(nq).setParameter("id", 3).getResultList();
        
        Object result[]=al.get(0);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
        System.out.println(result[3]);
        
        
    }
}
