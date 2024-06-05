package com.vickee.HiberTask1;

import java.util.ArrayList;
import java.util.Scanner;

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
	static public void menu()
	{
		System.out.println("-----------------------------------------Employee Management System-----------------------------------------------");
		System.out.println("Menu");
		System.out.println("1. Add Employee");
		System.out.println("2. Find Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Delete Employee");
		System.out.println("5. View all Employee");
		System.out.println("6. Exit");
		System.out.println("Enter your choice");
	}
    public static void main( String[] args )
    {
		Scanner sc = new Scanner(System.in);
		Configuration cfg = new Configuration().configure("HiberTask1.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        String msg;
		do
		{
			menu();
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter id,name,location");
				int id=sc.nextInt();
				String name=sc.next();
				String loc=sc.next();
		        Employee e1= new Employee(id,name,loc);
		        session.save(e1);
		         tx.commit();
				break;
			case 2:
				System.out.println("Enter the Employee ID");
				int id1 = sc.nextInt();
				Employee e2 = session.get(Employee.class,id1);
				System.out.println(e2);
				break;
			case 3:
				System.out.println("Enter the id to update:");
    			int u = sc.nextInt();
    			Employee e3 = session.find(Employee.class, u);
    			e3.setEid(u);
    			e3.setName(sc.next());
    			e3.setCity(sc.next());
    			if(e3 != null) {
    				session.update(e3);
        			tx.commit();
        			System.out.println(e3);
        			System.out.println("Record updated successfully");
    			}
    			else
    				System.out.println("Record not found");
    			break;
			case 4:
				System.out.println("Enter the Employee ID");
				int id2 = sc.nextInt();
				Employee e4 = session.find(Employee.class,id2);
				session.delete(e4);
				tx.commit();
				System.out.println(e4);
				break;
			case 5:
				ArrayList<Employee> list =(ArrayList)session.createQuery("From Employee").list();
		        for(Employee emp: list)
		        {
		        	System.out.println(emp);
		        }
		        break;
			case 6: 
				System.out.println("Process Over");
				System.exit(0);
				break;
			case 7:
				System.exit(choice);
				break;
			}
				System.out.println("Do you want to continue [Yes /No ]");
				msg=sc.next();
		}while(msg.equalsIgnoreCase("Yes"));
    }
}
