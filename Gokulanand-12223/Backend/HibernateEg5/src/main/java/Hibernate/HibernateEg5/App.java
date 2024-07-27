package Hibernate.HibernateEg5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Hibernate.HibernateEg5.Mapping;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("Mapping.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session =  sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Mapping m = new Mapping(1, "Virat", "India");
        Mapping_Concept mc = new Mapping_Concept(101, "Dhoni", "India", 10000);
        Mapping_Concept2 mc2 = new Mapping_Concept2(201, "Sachien", "India", 3);
        session.save(m);
        session.save(mc);
        session.save(mc2);
        tx.commit();      
    }
}
