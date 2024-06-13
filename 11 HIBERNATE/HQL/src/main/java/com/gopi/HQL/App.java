package com.gopi.HQL;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.mysql.cj.Query;

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
         Criteria c = session.createCriteria(Employee.class);
         
//         c.add(Restrictions.gt("Branch", 2));   //for projection
         c.setProjection(Projections.property("name"));
         
//         Employee e1 = new Employee();
//         e1.setName("Gopi");
//         e1.setBranch(5);
//         
//         session.save(e1);
//         tx.commit();
         
//         String hql = "From Employee";
//         javax.persistence.Query query =session.createQuery(hql);
//         ArrayList<Employee> employees = (ArrayList) c.list();
//         
//         String hql1 = "select name From Employee";
//         javax.persistence.Query query1 =session.createQuery(hql1);
         ArrayList<String> names = (ArrayList)c.list();
         
//         String hql2 ="insert into Employee(name,branch)"+"select name, branch from Employee";
//         javax.persistence.Query query2 =session.createQuery(hql2);

         
//         String hql3 = "update Employee set name=?1 where id =?2";
//         javax.persistence.Query query3 =session.createQuery(hql3);
//         query3.setParameter(1, "GK");
//         query3.setParameter(2, 1);
       
//         String hql3 = "delete from Employee where id =?1";
//         javax.persistence.Query query3 =session.createQuery(hql3);
//         query3.setParameter(1, 1);
         
//         query2.executeUpdate();
//         tx.commit();
         
//         for(Employee employee : employees) {
//        	 System.out.println(employee);
//         }
         for(String name : names) {
        	 System.out.println(name);
         }
    }
}
