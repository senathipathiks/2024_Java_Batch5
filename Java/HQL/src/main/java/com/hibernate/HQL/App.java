package com.hibernate.HQL;

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
        Configuration cfg =new Configuration().configure("hql.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();

//        Inserting One value into the db;
//        Employee emp = new Employee();
//        emp.setName("Nagarjun");
//        emp.setBatch(5);
//        s.save(emp);
//        tx.commit();
        
//        From clause
//        String hql = "From Employee";
//        Query query = s.createQuery(hql);
        
//        Select Clause
//        String hql = "Select name from Employee";
//        Query query = s.createQuery(hql);
        
//       Printing Statement for Select,insert Clauses
//        ArrayList<String> emplist = (ArrayList) query.getResultList();
//        
//        for(String emp : emplist) {
//        	System.out.println(emp);
//        }
        
//        Insert Clause
        String hql = "Insert into Employee (name,batch)"+"select name,batch from Employee";
        Query query = s.createQuery(hql);
        query.executeUpdate();
        tx.commit();
        
//        Update Clause
//        String hql = "Update Employee set name=?1 where id=?2";
//        Query query = s.createQuery(hql);
//        query.setParameter(1, "Nagarjun N S");
//        query.setParameter(2, 1);
//        query.executeUpdate();
//        tx.commit();
        

//      String hql = "delete from Employee where id=?1";
//      Query query = s.createQuery(hql);
//      query.setParameter(1, 1);
//      query.executeUpdate();
//      tx.commit();
      
        

    }
}
