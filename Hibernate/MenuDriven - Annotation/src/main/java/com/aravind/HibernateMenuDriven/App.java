package com.aravind.HibernateMenuDriven;

import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;

public class App 
{
	public static void menu() {
		System.out.println("----------------Employee Management System----------------------");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Find Employee");
		System.out.println("5. ViewAll Employee");
		System.out.println("6. Exit");
	}
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	
    	String msg;
        do {
        	        	
            Configuration c = new Configuration().configure().addAnnotatedClass(Employee.class);
            SessionFactory s = c.buildSessionFactory();
            Session session = s.openSession();
            Transaction tx = session.beginTransaction();

        	menu();
        	System.out.println("Enter you choice:");
        	int ch = sc.nextInt();
        	
        	switch(ch) {
        		case 1:
        	        System.out.println("Enter empid, empname, empDep, empsal");
        			Employee e = new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next());
        			if(e != null) {
        				session.save(e);
            			tx.commit();
            			System.out.println("Record Inserted successfully!");	
        			}
        			else {
        				System.out.println("Record not inserted");
        			}
        			break;
        			
        		case 2:
        			System.out.println("Enter emp id to delete:");
        			int d = sc.nextInt();
        			Employee e5 = session.find(Employee.class, d);
        			if(e5 != null) {
        				session.delete(e5);
            			tx.commit();
            			System.out.println("Record deleted");
        			}
        			else {
        				System.out.println("Record not found");
        			}
        			
        			break;
        			
        		case 3:
        			System.out.println("Enter the id to update:");
        			int u = sc.nextInt();
        			Employee e4 = session.find(Employee.class, u);
        			e4.setEid(u);
        			e4.setEname(sc.next());
        			e4.setDep(sc.next());
        			e4.setSal(sc.next());
        			if(e4 != null) {
        				session.update(e4);
            			tx.commit();
            			System.out.println(e4);
            			System.out.println("Record updated successfully");
        			}
        			else 
        				System.out.println("Record not found");
        	
        			break;
        			
        		case 4:
        			System.out.println("Enter the emp id to find");
        			int f = sc.nextInt();
        			Employee e2 = session.find(Employee.class,f);
        			if(e2!=null) {
        				System.out.println("Record found");
        				System.out.println(e2);
        			}
        			else {
        				System.out.println("Record not found");
        			}
        			break;
        			
        		case 5:
        			ArrayList<Employee> list = (ArrayList) session.createQuery("From Employee").list();
        			
        			for(Employee e3 : list) {
        				System.out.println(e3);
        			}
        			break;
        		case 6:
        			session.close();
        			System.out.println("Session ended");
        			System.exit(0);
        			break;
        		default:
        			System.out.println("Enter valid case");
        			break;
        			
        	}
        	System.out.println("Do you want to continue:[yes | no]:");
        	msg = sc.next();
        }while(msg.equalsIgnoreCase("yes"));
          
    }
}
