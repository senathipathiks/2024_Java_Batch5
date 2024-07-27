package Hibernate.HQL;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("HQL.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session =  sf.openSession();
        Transaction tx = session.beginTransaction();
        
//        Employee e1 = new Employee();
//        
//        e1.setName("Sathyadev");
//        
//        session.save(e1);
//        
//        tx.commit();
        
        
//        String hql = "From Employee";
//        Query query = session.createQuery(hql);
//        ArrayList<Employee> employees = (ArrayList) query.getResultList();
//        
//        for (Employee employee : employees)
//        {
//        	System.out.print(employee);
//        }
        
//        
//        String hql = "SELECT name FROM Employee";
//        Query query = session.createQuery(hql);
//        ArrayList<Employee> names = (ArrayList) query.getResultList();
//        
//        for (Employee name : names)
//        {
//        	System.out.print(name);
//        }
        
        
//        String hql = "insert into Employee values (:name)";
//        Query query = session.createQuery(hql);
//        query.setParameter("name", "Gokul Anand");
//        query.executeUpdate();
//        tx.commit();
        
//        String hql = "update Employee set name = ?1 where id = ?2";
//        Query query = session.createQuery(hql);
//        query.setParameter(1, "Sathyadev");
//        query.setParameter(2, 1);
//        query.executeUpdate();
//        tx.commit();
        
//        String hql = "delete from Employee where id = ?1";
//        Query query = session.createQuery(hql);
//        query.setParameter(1, 1);
//        query.executeUpdate();
//        tx.commit();

    }
}
