package com.spring.OneToMany;

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
    	Configuration cfg =new Configuration().configure("map1-m.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        Employee e1 = new Employee();
        
        e1.setName("Vashanth");
        
        List<Address> list=new ArrayList<Address>();
        Address add1=new Address();
        Address add2=new Address();
        
       add1.setCity("Madurai");
       add2.setCity("VirudhuNAgar");
       list.add(add1);
       list.add(add2);
       
       e1.setAddress(list);
       
       
       s.save(e1);
        
     
        tx.commit();
    }
}
