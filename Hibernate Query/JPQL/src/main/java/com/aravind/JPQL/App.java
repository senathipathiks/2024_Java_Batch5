package com.aravind.JPQL;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        
//        Employee e = new Employee(12,"Arun","CSE",40000);
//        em.getTransaction().begin(); // it will begin the transaction
//        
//       //em.persist(e);//to save or else merge method. it won't work to mine
//        em.merge(e);
//        
//        em.getTransaction().commit(); //to commit
        
//        Employee e = em.find(Employee.class, 2);
//        System.out.println(e);
        
//          Employee e = em.find(Employee.class, 2);
//          e.setSal(50000);
//          em.getTransaction().begin();
//          em.merge(e);
//          em.getTransaction().commit();
        
        String j = "Update Employee set sal =: sal where id =: id";
        em.getTransaction().begin();
        
        Query q = em.createQuery(j);
        q.setParameter("sal", 8000.0f);
        q.setParameter("id", 1);
        
        q.executeUpdate();
        
        em.getTransaction().commit();
        
//        Employee emp = em.find(Employee.class, 2);
//        em.getTransaction().begin();
//        
//        em.remove(emp);
//        em.getTransaction().commit();
        
//        String j2 = "Delete from Employee where id=: id";
//        em.getTransaction().begin();
//        
//        Query q1 = em.createQuery(j2);
//        q1.setParameter("id", 2);
//        
//        q1.executeUpdate();
//        em.getTransaction().commit();
        
//        //Named query
//        Employee emp = em.createNamedQuery("findbyid",Employee.class).setParameter(1, 1).getSingleResult();
//        System.out.println(emp);
        
        //Native query
        String nq = "Select * from emp1 where eid = :id";
        ArrayList<Object[]> al = (ArrayList) em.createNativeQuery(nq).setParameter("id", 1).getResultList();
        Object result[] =  al.get(0);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
        System.out.println(result[3]);
        
          
        
    }
}
