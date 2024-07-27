package Hibernate.HCQL;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class App 
{
    public static void main( String[] args )
    {
        
    	Configuration cfg = new Configuration().configure("HCQL.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session =  sf.openSession();
        Transaction tx = session.beginTransaction();
        
//       Criteria c = session.createCriteria(Employee.class);
//       c.add(Restrictions.gt("salary", 10000));
//       
//       ArrayList<Employee> emp = (ArrayList<Employee>) c.list();
//       for (Employee i : emp)
//       {
//    	   System.out.println(emp);
//       }
       
//       Criteria c = session.createCriteria(Employee.class);
//       c.setProjection(Projections.property("name"));
//       c.addOrder(Order.asc("name"));
//       ArrayList<String> emp = (ArrayList<String>) c.list();
//       for (String i : emp)
//       {
//    	   System.out.println(i);
//       }
       
    }
}
