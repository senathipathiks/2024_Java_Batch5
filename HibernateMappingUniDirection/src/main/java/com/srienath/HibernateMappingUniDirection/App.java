package com.srienath.HibernateMappingUniDirection;

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
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        //-------------------------------one-to-one
        Address add1 = new Address();
        add1.setCity("madurai");
        add1.setStreet("periyasamy-nagar");
        
        Address add2 = new Address();
        add2.setCity("madurai");
        add2.setStreet("vilangudi");
        
        User user1 = new User();
        user1.setName("subash");
        user1.setAddress(add1);
        
        User user2 = new User();
        user2.setName("srienath");
        user2.setAddress(add2);
        
        //--------------------------------one-to-many
        Mobile m1 = new Mobile();
        m1.setBrand("Redmi");
        m1.setModel("Note 10 pro");
        
        Mobile m2 = new Mobile();
        m2.setBrand("RealMe");
        m2.setModel("Narzo 70 Pro");
        
        
        List<Mobile> mob = new ArrayList<>();
        mob.add(m1);
        mob.add(m2);
        
        user1.setMobile(mob);
        user2.setMobile(mob);
        
        //---------------------------Many-to-Many
        
        Vehicle v1 = new Vehicle();
       
        Vehicle v2 = new Vehicle();
        
        
        List<Vehicle> veh = new ArrayList<>();
        veh.add(v1);
        veh.add(v2);
        
        List<User> use = new ArrayList<>();
        use.add(user1);
        use.add(user2);
        
        user1.setVehicle(veh);
        user2.setVehicle(veh);
        
        v1.setName("Royal Enfield GT 650");
        v1.setUser(use);
        v2.setName("Hero XPulse");
        v2.setUser(use);
        
        session.save(user1);
        session.save(user2);
        
        tx.commit();
    }
}
