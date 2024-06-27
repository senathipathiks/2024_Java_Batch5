package com.keerthana.hql;






import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        Criteria c = session.createCriteria(Employee.class);
        
//        Employee e1=new Employee();
//        e1.setName("Sena");
//        e1.setBatch(5);
//        
//        session.save(e1);
//        tx.commit();
        
        //String hql=" select name From Employee";
      //ArrayList<Employee> employee=(ArrayList)q.getResultList();
        
        //String hql="  From Employee";
        //ArrayList<String> names=(ArrayList)q.getResultList();
        
        //String hql="update Employee set name=?1 where id=?2";
        
//        Query q=session.createQuery(hql);
//        q.setParameter(1, "Giri");
//        q.setParameter(2, 1);
//        q.executeUpdate();
        
//        for(String namee:names) {
//        	System.out.println(namee);
//        }
//        String hql = "insert into Employee(name,batch)"+"select name, batch from Employee";
//        Query q=session.createQuery(hql);
//        q.executeUpdate();
//        tx.commit();
        
//        String hql = "delete from Employee where id=?1";
//   	 Query query = session.createQuery(hql);
//   	 query.setParameter(1, 1);
//   	
//   	 query.executeUpdate();
//   	 tx.commit();
//        Employee e2=new Employee();
//        e2.setName("subbu");
//        e2.setSalary("777");
//        e2.setDept("cse");
//        session.save(e2);
//        tx.commit();
        c.add(Restrictions.gt("salary","800"));//salary is the propertyname  
        ArrayList<Employee>employees=(ArrayList)c.list();
    	for(Employee employee:employees)
    	{
    		System.out.println(employee);
    	}
        
        
        
    }
}
