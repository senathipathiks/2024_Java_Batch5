package com.gana.HQL;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


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
        
        //HCQL
//        Criteria c = session.createCriteria(Employee.class);
//        c.add(Restrictions.gt("batch",2));
//        ArrayList<Employee> employees = (ArrayList) c.list();
//        for(Employee employee : employees) {
//        	System.out.println(employee);
//        }
        
        //HCQL methods
//        Criteria c = session.createCriteria(Employee.class);
//        c.setProjection(Projections.property("name"));
//        c.addOrder(Order.asc("name"));
//        ArrayList<String> names = (ArrayList) c.list();
//        for(String name : names) {
//        	System.out.println(name);
//        }
//        
        
//        
//        Employee employee = new Employee();
//        employee.setName("Raman");
//        employee.setBatch(77);
//        
//        session.save(employee);
//        tx.commit();
//        
        //FROM clause in HQL
//        String hql = "From Employee";
//        Query query = session.createQuery(hql);
//        ArrayList<Employee> employees = (ArrayList) query.getResultList();
//        
//        for(Employee employee : employees) {
//        	System.out.println(employee);
//        }
        
        //SELECT clause in HQL
//        String hql = "select name From Employee";
//        Query query = session.createQuery(hql);
//        ArrayList<String> names = (ArrayList) query.getResultList();
//        
//        for(String name : names) {
//        	System.out.println(name);
//        }
        
        //UPDATE clause in HQL
//        String hql = "update Employee set name=?1 where id=?2";
//        Query query = session.createQuery(hql);
//        query.setParameter(1, "Ganapathy");
//        query.setParameter(2, 1);
//        
//        query.executeUpdate();
//        tx.commit();
        
        
        //DELETE clauuse in HQL
//        String hql = "delete from Employee where id=?1";
//        Query query = session.createQuery(hql);
//        query.setParameter(1, 1);
//        query.executeUpdate();
//        tx.commit();
        
        //INSERT clause in HQL
//        String hql = "insert into Employee(name,batch)"+"select name, batch from Employee";
//        Query query = session.createQuery(hql);
//        query.executeUpdate();
//        tx.commit();
        
    }
}
