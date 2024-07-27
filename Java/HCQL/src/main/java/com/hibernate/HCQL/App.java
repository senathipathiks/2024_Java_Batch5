package com.hibernate.HCQL;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg =new Configuration().configure("hcql.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
//        Employee emp = new Employee();
//        emp.setBatch(5);
//        emp.setName("Senathipathi");
//        emp.setSalary(50000);
//        s.save(emp);
//        tx.commit();
//        
        Criteria c = s.createCriteria(Employee.class);
        
//        c.add(Restrictions.gt("salary", 10000));
        c.setProjection(Projections.property("name"));
        c.addOrder(Order.asc("name"));
        
        
        ArrayList<String>  emp = (ArrayList) c.list();
        
        for(String i : emp) {
        	System.out.println(i);
        }
    }
}
