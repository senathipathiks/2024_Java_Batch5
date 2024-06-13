package com.gopi.association2Maping;



import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import antlr.collections.List;



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
        
        
        java.util.List<Employee> list1 = new ArrayList<Employee>();
        java.util.List<Project> list2 = new ArrayList<Project>();
        
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        
        Project pjt1 = new Project();
        Project pjt2 = new Project();
        Project pjt3 = new Project();
        
        
        emp1.setName("Senthil");
        pjt1.setPname("Hotel Management");
        
        emp2.setName("Guna");
        pjt2.setPname("Student Management");
        
        emp3.setName("Velu");
        pjt3.setPname("Staff Management");
        
        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        
        list2.add(pjt1);
        list2.add(pjt2);
        list2.add(pjt3);
        
        pjt1.setEmployee(list1);
        pjt2.setEmployee(list1);
        pjt3.setEmployee(list1);
        
        emp1.setproject(list2);
        emp2.setproject(list2);
        emp3.setproject(list2);
        
        session.save(emp1);

        tx.commit();
        
    }
}
