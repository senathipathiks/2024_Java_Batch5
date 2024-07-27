package com.jpa.jpa_student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        Student s1 = new Student();
        s1.setSname("Nagarjun");
        em.persist(s1);
        
        Student s2 = em.find(Student.class, 1);
        s2.setSname("Suresh");
        em.merge(s2);
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
