package com.ManytoMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.OnetoMany.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg =new Configuration().configure("ManytoMany.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Project p1 = new Project();
        Project p2 = new Project();
        
        List<Employee> list1 = new ArrayList<Employee>();
        List<Project> list2 = new ArrayList<Project>();

        emp1.setName("Nagarjun");
        emp2.setName("Arjun");
        
        p1.setProject_name("Capstone Project");
        p2.setProject_name("Micro Project");
        
        list2.add(p2);
        list2.add(p2);
        
        list1.add(emp1);
        list1.add(emp2);
        
        emp1.s
        
        tx.commit();
    }
}
