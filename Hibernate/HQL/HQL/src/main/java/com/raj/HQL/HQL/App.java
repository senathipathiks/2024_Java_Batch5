package com.raj.HQL.HQL;

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
    	
//    	Employee e = new Employee();
//    	e.setName("Ponraj");
//    	e.setBatch(3);
//    	
//    	session.save(e);
//    	tx.commit();
    	
    	
    	// FROM CLAUSE
//    	String hql = "From Employee";
//    	Query query =  session.createQuery(hql);
//    	ArrayList<Employee> emp = (ArrayList)query.getResultList();
//    	
//    	for(Employee i : emp) {
//    		System.out.print(i);
//    	}
    	
    	
    	  // SELECT CLAUSE
//    	  String hql = "select name From Employee";
//	      Query query = session.createQuery(hql);
//	      ArrayList<String> names =(ArrayList) query.getResultList();
//	      
//	      for(String e:names) {
//	      	System.out.println(e);
//	      }
    	
    	
	   // INSERT CLAUSE
    	String hql = "insert into Employee(name,batch)"+"select name, batch from Employee";
    	Query query = session.createQuery(hql);
    	query.executeUpdate();
    	tx.commit();
    	
    	
    	
    	// UPDATE CLAUSE
//    	String hql = "update Employee set name=?1 where id=?2";
//    	Query query = session.createQuery(hql);
//    	query.setParameter(1, "Naga");
//    	query.setParameter(2, 1);
//    	query.executeUpdate();
//    	tx.commit();
    	
    	//DELETE CLAUSE
//    	String hql = "DELETE FROM Employee where id=?1";
//    	Query query = session.createQuery(hql);
//    	query.setParameter(1, 1);
//    	query.executeUpdate();
//    	tx.commit();
    	
    	
     }
}
