package com.gopi.jpql;


import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.query.NativeQuery;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu"); // interface
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        // INSERT
//        Employee employee = new Employee(2,"Siva","30,000");
//        em.getTransaction().begin();
//        
//        em.merge(employee);
//        
//        em.getTransaction().commit();
        
        
        // FIND JPA
//        Employee emp =em.find(Employee.class, 1);
//        System.out.println(emp);
        
        // UPDATE JPA
//        Employee emp = em.find(Employee.class, 1);
//        emp.setSalary("35,000");
//        em.getTransaction().begin();
//        em.merge(emp);
//        em.getTransaction().commit();
        
        
        // UPDATE JPQL
//         String jpql = "Update Employee set name =:na where id =:id";
//         em.getTransaction().begin();
//         javax.persistence.Query query = em.createQuery(jpql);
//         query.setParameter("na","Gopikrishnan");
//         query.setParameter("id",1);
//         query.executeUpdate();
//         em.getTransaction().commit();
         
        // REMOVE JPA
//        Employee emp = em.find(Employee.class,1);
//        em.getTransaction().begin();
//        em.remove(emp);
//        em.getTransaction().commit();
        
        //NAMED ENTITY
///        Employee emp = em.createNamedQuery("Display",Employee.class).setParameter(1,1).getSingleResult();
//        System.out.println(emp); 
        
//        String nq = "select * from employee where id = :id";
//        ArrayList<Object []> a1 = (ArrayList) em.createNativeQuery(nq).setParameter("id", 1).getResultList();
//        
////        
//        Object result[] = a1.get(0);
//        System.out.println(result[0]);
//        System.out.println(result[1]);
//        System.out.println(result[2]);
//        
//        Employee e1 = new Employee();
//        e1.setName("Siva");
//        e1.setSalary("45,000");
//        em.persist(e1);
        
//        Employee e2 = em.find(Employee.class,1);
//        e2.setName("Sandal");
//        e2.setSalary("50,000");
//        em.merge(e2);
        
        Employee e3 = em.find(Employee.class,3);
        em.remove(e3);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        

        
    }
}