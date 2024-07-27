package Hibernate.HibernateEg2;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("Employee.cfg.xml").addAnnotatedClass(Employee.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session =  sf.openSession();
        Transaction tx = session.beginTransaction();
        
        // By using Annotations 
        
        Employee e4 = new Employee (12224, "Gokul", "HOD", "EEE");
        session.save(e4);
        tx.commit();
        
        // Insert 
        
		/*
		 * Employee e1 = new Employee(12223, "Gokul Anand", "Professor", "EEE");
		 * session.save(e1);
		 * 
		 * Employee e2 = new Employee(12225, "TMGA", "Asst.Professor", "CSE");
		 * session.save(e2);
		 */
        
        // Find and Update
        
		/*
		 * Employee e3 = session.find(Employee.class, 12223); System.out.println(e3);
		 * 
		 * e3.setEmpdesig("Professor"); tx.commit();
		 */
        
        // View All
		/*
		 * ArrayList<Employee> list =
		 * (ArrayList)session.createQuery("From Employee").list(); for(Employee employee
		 * : list) { System.out.println(employee); }
		 */
    }
}
