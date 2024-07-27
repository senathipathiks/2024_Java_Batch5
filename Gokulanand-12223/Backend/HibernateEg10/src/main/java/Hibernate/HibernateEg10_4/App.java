package Hibernate.HibernateEg10_4;

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
    	Configuration cfg = new Configuration().configure("ManyToMany.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session =  sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        Project p1 = new Project();
        Project p2 = new Project();
        
        List<Employee> list1 = new ArrayList<Employee>();
        List<Project> list2 = new ArrayList<Project>();
        p1.setProjname("AAA");
        p2.setProjname("BBB");
        e1.setEmpname("Gokul");
        e2.setEmpname("Anand");
        
        list1.add(e1);
        list1.add(e2);
        list2.add(p1);
        list2.add(p2);
        
        p1.setEmplist(list1);
        p2.setEmplist(list1);
        
        e1.setProjlist(list2);
        e2.setProjlist(list2);

        session.save(e1);
        
        tx.commit();
    }
}
