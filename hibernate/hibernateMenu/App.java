package com.ani.hibernateMenu;

import org.hibernate.cfg.Configuration;


import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 * Hello world!
 *
 */
public class App 
{
	static public void menu()
	{
		System.out.println("Menu");
		System.out.println("1. Add Employee");
		System.out.println("2. Find Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Delete Employee");
		System.out.println("5. View all Employee");
		
		System.out.println("Enter your choice");
	}
    public static void main( String[] args )
    {


    		Scanner sc = new Scanner(System.in);
    		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	        SessionFactory sf = cfg.buildSessionFactory();
	        Session session = sf.openSession();
	        Transaction tx=session.beginTransaction();
//    		ProductManagement pm = new ProductManagement();
    		String msg;
    		do
    		{
    			menu();
    			int choice = sc.nextInt();
    			
    			switch(choice)
    			{
    			case 1:
    				
    		        Session session1 = sf.openSession();
    		        Transaction tx1=session1.beginTransaction();
    				System.out.println("Enter id,name,location");
    				int id=sc.nextInt();
    				String name=sc.next();
    				String loc=sc.next();
    		        Employee e1= new Employee(id,name,loc);
    		        session.save(e1);
    		         tx1.commit();
    		     
    				break;
    			case 2:
    				System.out.println("Enter the Employee ID");
    				int id1 = sc.nextInt();
    				Employee e2 = session.get(Employee.class,id1);
    				if(e2!=null)
    					System.out.println(e2);
    				else
    					System.out.println("Record not Found");
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
    				if(e4!=null)
    				{
    					session.delete(e4);
        				tx.commit();
        				System.out.println("Record deleted" + e4);
    				}
    				else
    				{
    					System.out.println("not deleted");
    				}
    				
    				break;
    			case 5:
    				ArrayList<Employee> list =(ArrayList)session.createQuery("From Employee").list();
    		        for(Employee emp: list)
    		        {
    		        	System.out.println(emp);
    		        }
    		        break;
    			case 6:
    				System.exit(choice);
    				break;
    			
    			}
    				System.out.println("Do you want to continue [Yes /No ]");
    				msg=sc.next();
    			
    		}while(msg.equalsIgnoreCase("Yes"));

    	}
   
}
