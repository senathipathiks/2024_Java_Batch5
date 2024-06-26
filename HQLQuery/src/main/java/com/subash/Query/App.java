package com.subash.Query;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Employee e1 = new Employee();
        e1.setName("Subash");
        e1.setBatch(5);
        
        session.save(e1);
        
       
        // select * from employee
//        String hql = "From Employee";
//        Query query = session.createQuery(hql);
//        ArrayList<Employee> employee =(ArrayList) query.getResultList();
//        
//        for(Employee e:employee) {
//        	System.out.println(e);
//        }
       // select name from employee
//        String hql = "select name From Employee";
//        Query query = session.createQuery(hql);
//        ArrayList<String> names =(ArrayList) query.getResultList();
//        
//        for(String e:names) {
//        	System.out.println(e);
//        }
//In hql insert (use for the insert record from to come with select records from another table and isert into another table) 
//        String hql = "insert into Employee (name, batch) values(:name, :batch)";
//        Query query = session.createQuery(hql);
//        
//        query.setParameter("name", "PSS");
//        query.setParameter("batch", 4);
//        
//        query.executeUpdate();
//        this is not runned why? i explained above please refer
        
        //update 
//        String hql = "update Employee set name=?1 where id=?2";
//        Query query = session.createQuery(hql);
//        query.setParameter(1, "Netaji");
//        query.setParameter(2, 1);
//        
//        query.executeUpdate();
        
//        //delete
//      String hql = "Delete from Employee where id=?1";
//      Query query = session.createQuery(hql);
//      query.setParameter(1, 1);
//      
//      
//      query.executeUpdate();
       
        //tx.commit();
       
        //insert will use like this
//      String hql = "insert into Employee (name, batch)"+"select name,batch from Employee";
//      Query query = session.createQuery(hql);
//     
//      
//      query.executeUpdate();
      tx.commit();
        
    }
}
