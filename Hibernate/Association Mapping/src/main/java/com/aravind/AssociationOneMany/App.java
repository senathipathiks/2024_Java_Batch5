package com.aravind.AssociationOneMany;



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
    	Configuration con = new Configuration().configure("hibernate.cfg2.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Employee e1 = new Employee();
        e1.setName("Aravind");
        
        List<Address> list = new ArrayList<Address>();
        
        Address add1 = new Address();
        Address add2 = new Address();
        
        add1.setCity("Dindigul");
        add2.setCity("Madurai");
        
       
        list.add(add1);
        list.add(add2);
        
        e1.setAddress(list);        
        session.save(e1);
        
        tx.commit();
        

    }
}
