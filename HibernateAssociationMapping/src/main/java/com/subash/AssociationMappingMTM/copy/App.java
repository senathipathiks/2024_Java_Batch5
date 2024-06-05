package com.subash.AssociationMappingMTM.copy;

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
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Employee2 e1 = new Employee2();
        Employee2 e2 = new Employee2();
        Project p1 = new Project();
        Project  p2 = new Project();
        
        List<Employee2> emp = new ArrayList<>();
        emp.add(e1);
        emp.add(e2);
        
        List<Project> proj = new ArrayList<>();
        proj.add(p1);
        proj.add(p2);
        
        p1.setPname("core java");
        p1.setEmployee(emp);
        
        p2.setPname("core Dotnet");
        p2.setEmployee(emp);
        
        e1.setName("subash");
        e1.setProject(proj);
        
        e2.setName("Ponraj");
        e2.setProject(proj);
        
        session.save(e1);
        
        

        tx.commit();
    }
}
