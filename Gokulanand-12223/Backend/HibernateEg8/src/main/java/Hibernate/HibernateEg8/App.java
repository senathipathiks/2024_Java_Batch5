package Hibernate.HibernateEg8;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("Vehicle.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session =  sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Vehicle veh = new Vehicle(101, "Dhanya", "Madurai");
        Twowheeler two = new Twowheeler(102, "Elisa", "Sivagangai", 2001, "Royal Enfield", "Interceptor");
        Fourwheeler four = new Fourwheeler(103, "Faizal", "Theni", 2020, "Mercedes", "AMG63");
        
        session.save(veh);
        session.save(two);
        session.save(four);
        
        tx.commit();
    }
}
