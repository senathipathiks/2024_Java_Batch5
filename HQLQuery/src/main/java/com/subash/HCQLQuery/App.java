package com.subash.HCQLQuery;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.subash.Query.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg2.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
//        Employee1 e = new Employee1();
//        e.setName("Subash");
//        e.setBatch(5);
//        e.setSalary(5000);
//        
//        session.save(e);
        
        
       
		Criteria c= session.createCriteria(Employee1.class);
        
        c.add(Restrictions.gt("salary", 1000));
        
        ArrayList<Employee1> employees = (ArrayList) c.list();
        
        for(Employee1 e:employees) {
        	System.out.println(e);
        }
        
        c.setProjection(Projections.property("name"));
        c.addOrder(Order.asc("name"));
        
        
        ArrayList<String> names = (ArrayList)c.list();
        
        for(String name : names) {
        	System.out.println(name);
        }
        tx.commit();
        
    }
}
