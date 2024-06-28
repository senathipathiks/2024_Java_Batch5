package com.gana.JPQL;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Employee e1 = new Employee();
        e1.setName("Tommy");
        e1.setBatch(90);
        em.persist(e1);

        
        Employee e2 = em.find(Employee.class, 9);
        e2.setName("Hurry");
        e2.setBatch(78);
        em.merge(e2);
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        
//        String nq = "Select * from emp where id = :id";
//        ArrayList<Object[]> a1 = (ArrayList) em.createNativeQuery(nq).setParameter("id",3).getResultList();
//        Object result[] = a1.get(0);
//        System.out.println(result[0]);
//        System.out.println(result[1]);
//        System.out.println(result[2]);
        
          //Find using Named query
//        Employee employee = em.createNamedQuery("findById",Employee.class).setParameter(1,3).getSingleResult();
//        System.out.println(employee);
        
          //Delete using JPQL
//        Employee employee = em.find(Employee.class,1);
//        em.getTransaction().begin();
//        em.remove(employee);
//        em.getTransaction().commit();
        
        
        
          //Update using JPQL
//        String jpql = "Update Employee set batch = :bat where id = :id";
//        em.getTransaction().begin();
//        Query query = em.createQuery(jpql);
//        query.setParameter("bat", 98);
//        query.setParameter("id", 1);
//        query.executeUpdate();
//        em.getTransaction().commit();
        
          //Update method
//        Employee employee = em.find(Employee.class,1);
//        employee.setBatch(87);
//        em.getTransaction().begin();
//        em.merge(employee);
//        em.getTransaction().commit();
        
        
        
          //Find method
//        Employee employee = em.find(Employee.class,1);
//        System.out.println(employee);
        
          //Create method
//        Employee employee = new Employee(12, "Ram",7);
//        em.getTransaction().begin();
//        em.merge(employee);
//        em.getTransaction().commit();
        

    }
}
