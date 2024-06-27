package com.subash.HibernateEx3Annotaion;

import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;







public class App 
{
	
	static public void menu() {
		System.out.println("1. Insert");
		System.out.println("2. Update");
		System.out.println("3. Delete");
		System.out.println("4. View");
		System.out.println("5. Exit");

		System.out.println("Enter your choice");

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String msg = "";
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
		do {
			
			App.menu();
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				
		        System.out.println("Enter empId,empName,empCity");
		        int empId = sc.nextInt();
		        String name = sc.next();
		        String city = sc.next();
		        Employee s1 = new Employee(empId,name,city);
		        session.save(s1);		        
		        	break;
			case 2:
				System.out.println("Enter the id to update: ");
				int id = sc.nextInt();
				 Employee s2 = session.find(Employee.class, id);  //find
				 if(s2!=null) {
					 System.out.println("Enter empName,empCity");
					 String name1 = sc.next();
				     String city1 = sc.next();
				     s2.setEname(name1);
					 s2.setEcity(city1);
				     session.update(s2); 
				     System.out.println("updated");
				 } else {
					 System.out.println("No records found to update");
				 }
				break;
			case 3:
				System.out.println("Enter the id to Delete: ");
				int id1 = sc.nextInt();
				 Employee s3 = session.find(Employee.class, id1);  //find
				 if(s3!=null) {
					 session.delete(s3); 
				     System.out.println("Deleted");
				 } else {
					 System.out.println("No records found to Delete");
				 }
				break;
			case 4:
				 ArrayList<Employee> list = (ArrayList)session.createQuery("From Employee").list();
			        for(Employee s:list) {
			        	System.out.println(s);
			        }
				break;
			case 5:
				
				System.exit(0);
				break;
			}
			
			System.out.println("Do you want to continue [Yes || NO]");
			msg = sc.next();

		} while (msg.equalsIgnoreCase("yes"));
		tx.commit();
		sc.close();

	}
//    public static void main( String[] args )
//    {
//    	Scanner sc = new Scanner(System.in);
//    	while(choice!=5) {
//    		
//    	}
//    	
//    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
//        SessionFactory sf = cfg.buildSessionFactory();
//        Session session = sf.openSession();
//        Transaction tx = session.beginTransaction();
//        Employee s1 = new Employee(124,"subash","Madurai");
//        session.save(s1);
////        session.find(Employee.class, 123);
//        tx.commit();
//    }
}
