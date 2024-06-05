package com.raj.HCQL;



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
    private static final String ArrayList = null;

	public static void main( String[] args )
    {
    	 Configuration cfg =  new Configuration().configure("hibernate.cfg.xml");
         SessionFactory sf = cfg.buildSessionFactory();
         Session session = sf.openSession();
         Transaction tx =  session.beginTransaction();
         
         Criteria c = session.createCriteria(Employee.class);
         
//         c.add(Restrictions.gt("salary", 50000));
//         
//         ArrayList<Employee> emp = (ArrayList)c.list();
//         
//         
//         for(Employee i : emp) {
//	        System.out.println(i);        	 
//         }
         
         c.setProjection(Projections.property("name"));
         c.addOrder(Order.asc("name"));
         
         ArrayList<String> names = (ArrayList)c.list();
         
       for(String i : names) {
	        System.out.println(i);        	 
       }
         
         
         
         
         
         
         
         
    }
}
