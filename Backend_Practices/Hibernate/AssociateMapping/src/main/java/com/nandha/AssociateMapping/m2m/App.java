package com.nandha.AssociateMapping.m2m;

import java.util.ArrayList;
import java.util.List;

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

    	Configuration cfg = new Configuration().configure("hibernate.cfg3.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Project p1 = new Project();
        Project p2 = new Project();
        
        List<Employee> list1 = new ArrayList<Employee>();
        e1.setName("Nandhakumaran");
        p1.setProjectName("Chitti");
        
        List<Project> list2 = new ArrayList<Project>();
        e2.setName("Jeeva");
        p2.setProjectName("Elsa");
        
        list1.add(e1);
        list1.add(e2);
        list2.add(p1);
        list2.add(p2);
        
        p1.setEmpList(list1);
        p2.setEmpList(list1);
        
        e1.setProjectList(list2);
        e2.setProjectList(list2);
        
        
        s.save(e1);
        tx.commit();
    }
}
