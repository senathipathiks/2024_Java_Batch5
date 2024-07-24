package com.aravind.JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu"); 
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin(); // it will begin the transaction
        Employee e = new Employee();
        e.setName("guru");
        e.setDept("cse");
        e.setSal(5000.0f);
        em.persist(e); //it will save
        //em.getTransaction().commit();
        
        Employee e1 = em.find(Employee.class, 2);
        e1.setName("vickee");
        em.merge(e1);
        em.getTransaction().commit();
       em.close();
       emf.close();    
        
    }
}
