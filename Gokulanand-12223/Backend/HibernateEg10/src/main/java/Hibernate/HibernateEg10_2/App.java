package Hibernate.HibernateEg10_2;

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
    	Configuration cfg = new Configuration().configure("OneToMany.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session =  sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Employee e1 = new Employee();
        e1.setName("Gokul");
        
        List<Address> list = new ArrayList<Address>();
        Address add1 = new Address();
        Address add2 = new Address();
        
        add1.setCity("Chennai");
        add2.setCity("Madurai");
        
        list.add(add1);
        list.add(add2);
        
        e1.setList(list);
        
        session.save(e1);

        tx.commit();
    }
}
