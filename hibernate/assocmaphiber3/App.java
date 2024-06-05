package com.ani.assocmaphiber3;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ani.assocmaphiber3.Project;
import com.ani.assocmaphiber3.Employee;

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
	Employee e1 = new Employee();
	Employee e2= new Employee();
	Project p1= new Project();
	Project p2=new Project();
	e1.setName("Ani");

	List<Employee> list1 = new ArrayList<Employee>();
	list1.add(e1);
	list1.add(e2);
	p1.setName("Ani");
	p1.setEmployee(list1);
	p2.setName("Kingse");
	p2.setEmployee(list1);

	
	List<Project> list2 = new ArrayList<Project>();
	list2.add(p1);
	list2.add(p2);
	e1.setName("Software");
	e1.setProject(list2);
	e1.setName("Delviery");
	e1.setProject(list2);
	

	session.save(e1);

	tx.commit();
    }
}
