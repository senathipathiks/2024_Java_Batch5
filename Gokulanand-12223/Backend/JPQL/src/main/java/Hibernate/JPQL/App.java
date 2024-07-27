package Hibernate.JPQL;

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
        
//        Employee e1 = new Employee(03, "Kaathavan", "100000");
//        
//        em.getTransaction().begin();
//        
//        em.merge(e1);
//        
//        em.getTransaction().commit();
        
//        Employee emp = em.find(Employee.class, 2);
//        emp.setSalary("85000");
//        em.getTransaction().begin();
//        em.merge(emp);
//        em.getTransaction().commit();
    
//        String jpql = "Update Employee set salary = :sal where id = :i";
//        em.getTransaction().begin();
//        Query query = em.createQuery(jpql);
//        query.setParameter("sal", "750000");
//        query.setParameter("i", 1);
//        query.executeUpdate();
//        em.getTransaction().commit();
    
//        Employee emp = em.find(Employee.class, 3);
//        em.getTransaction().begin();
//        em.remove(emp);
//        em.getTransaction().commit();
        
//        Employee employee = em.createNamedQuery("findById", Employee.class).setParameter(1, 2).getSingleResult();
//        System.out.println(employee);
        
        String nq = "Select * from emp where id = :id";
        ArrayList<Object[]> arr = (ArrayList<Object[]>) em.createNativeQuery(nq).setParameter("id", 1).getResultList();
        Object result[] = arr.get(0);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);    
    }
}
