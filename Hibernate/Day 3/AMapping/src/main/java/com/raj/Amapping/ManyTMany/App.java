package com.raj.Amapping.ManyTMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg =  new Configuration().configure("hibernate.cfg3.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx =  session.beginTransaction();
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Project p1 = new Project();
        Project p2 = new Project();
        
        List<Project> list1 = new ArrayList<Project>();
        List<Employee> list2 = new ArrayList<Employee>();
        
        e1.setName("Ponraj");
        e2.setName("Vasi");
        
        p1.setPname("RLZ11cc");
        p2.setPname("Bnk009K");
        
       
        list1.add(p1);
        list1.add(p2);
        
        list2.add(e1);
        list2.add(e2);
        
        e1.setProject(list1);
        e2.setProject(list1);
        
        p1.setEmployee(list2);     
        p2.setEmployee(list2);     
        
       
        session.save(e1);
     
        tx.commit();
        
    }
}
