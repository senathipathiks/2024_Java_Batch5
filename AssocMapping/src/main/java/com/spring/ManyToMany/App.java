package com.spring.ManyToMany;

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
    	Configuration cfg =new Configuration().configure("mapM-m.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        List<Project> pList = new ArrayList<Project>();
        List<Employee> elist=new ArrayList<Employee>();
        
        e1.setName("Vashanth");
        e2.setName("PonRaj");
        
        Project p1 = new Project();
        Project p2 = new Project();
        
        p1.setProjectname("MicroProject");
        p2.setProjectname("CapStone");
        
        elist.add(e1);
        elist.add(e2);
        
        pList.add(p2);
        pList.add(p1);
        
        e1.setProjects(pList);
        e2.setProjects(pList);
        
        p1.setEmployee(elist);
        p2.setEmployee(elist);
        
     
       
       
       
        s.save(e1);
            
        tx.commit();
    }
}
