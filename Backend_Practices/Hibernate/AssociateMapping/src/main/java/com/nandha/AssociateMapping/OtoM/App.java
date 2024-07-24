package com.nandha.AssociateMapping.OtoM;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nandha.AssociateMapping.OtoM.Employee;
import com.nandha.AssociateMapping.OtoM.Laptop;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	Configuration cfg = new Configuration().configure("hibernate.cfg2.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        Employee e1 = new Employee();
        e1.setName("Nandhakumaran");
        List<Address> list = new ArrayList<Address>();
        Address add1 = new Address();
        Address add2 = new Address();
        add1.setCity("Madurai");
        add2.setCity("Trichy");
        
        list.add(add1);
        list.add(add2);
        
        Employee e2 = new Employee();
        e2.setName("Jeeva");
        List<Address> list1 = new ArrayList<Address>();
        Address add3 = new Address();
        Address add4 = new Address();
        add3.setCity("Chennai");
        add4.setCity("Kanyakumari");
        
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        
        list1.add(add3);
        list1.add(add4);
        
        e1.setAddress(list);
        e1.setLaptop(l1);
        l1.setlName("HP");
        
        e2.setAddress(list1);
        e2.setLaptop(l2);
        l2.setlName("DELL");  
        
        
        s.save(e1);
        s.save(e2);
        tx.commit();
    }
}
