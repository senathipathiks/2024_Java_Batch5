package com.subash.JPA;

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
        EntityManager em = emf.createEntityManager();                         //entitymanager is interface
        
        Employee  employee = new Employee();
        employee.setName("subash");
        employee.setBatch(5);
        employee.setSal(10000);
        employee.setDept("CSE");
        em.getTransaction().begin();
        em.persist(employee);  //persist use panna setters use pannanu
        em.getTransaction().commit();
        
        
//        //find
//        Employee employee2 = em.find(Employee.class, 1);
//        
//        System.out.println(employee2);
        
//        //update
//        String jpql = "Update Employee set salary = :sal where id = :id";
//        em.getTransaction().begin();
//        Query query = em.createQuery(jpql);
//        query.setParameter("sal", 40000);
//        query.setParameter("id", 1);
//        
//        query.executeUpdate();
//        
//        em.getTransaction().commit();
        
//        //remove
//        Employee employee = em.find(Employee.class, 1);
//        em.getTransaction().begin();
//        
//        em.remove(employee);
//        em.getTransaction().commit();
        
        
        //-----------------------------NAMED QUERY------------------------------------------------
        //parameter could set dynamically
//        Employee employee = em.createNamedQuery("findById",Employee.class).setParameter(1,2).getSingleResult();
//
//        System.out.println(employee);
        
        //-----------------------------NATIVE QUERY-------------------------------------------------
//        String nq = "Select * from EmployeeJPA where EmpId = :id";
//        ArrayList<Object[]> al = (ArrayList)em.createNativeQuery(nq).setParameter("id", 2).getResultList();
//        
//        Object result[] = al.get(0);
//        System.out.println(result[0]);
//        System.out.println(result[1]);
//        System.out.println(result[2]);
//        System.out.println(result[3]);
//        System.out.println(result[4]);
        
        
    }
}
