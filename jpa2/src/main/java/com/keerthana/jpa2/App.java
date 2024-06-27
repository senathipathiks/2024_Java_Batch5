package com.keerthana.jpa2;

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
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("persistence");
       EntityManager em=emf.createEntityManager();
       em.getTransaction().begin();
       Student s1=new Student();
       s1.setName("Sanjai");
       s1.setCity("Chn");
       em.persist(s1);
       
       em.getTransaction().commit();
       em.close();
       emf.close();
    }
}
