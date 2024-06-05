package com.raj.HibernatePractice;



import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
	static Scanner sc = new Scanner(System.in);
	
	public static int displayMenu()
	{
		System.out.println("------------------------Menu-------------------");
		System.out.println("1. Insert");
		System.out.println("2. Delete");
		System.out.println("3. ViewAll");
		System.out.println("4. Update");
		System.out.println("5. Find"); 
		System.out.println("6. Exit");
		System.out.println("-------------------------------------------------");
		System.out.println(" ");
		System.out.print("Enter your Choice : ");
		int choice  = sc.nextInt();
		System.out.println(" ");
		return choice;	
	}
    public static void main( String[] args )
    {
    	 Configuration cfg =  new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
         SessionFactory sf = cfg.buildSessionFactory();
         Session session = sf.openSession();
         Transaction tx =  session.beginTransaction();
         
    	String ch;
		do {
			
		switch(displayMenu())
		{
			case 1:
				System.out.print("Enter the id,Name,City : ");
				Student s1 = new Student(sc.nextInt(),sc.next(),sc.next());
		        session.save(s1);
		        System.out.print("Inserted Successfully!");
				break;
			case 2:
				System.out.print("Enter the Id to be Deleted : ");
				int n = sc.nextInt();
				 Student s11 = session.find(Student.class,n);
		          if(s11 != null) {
		        	  session.delete(s11); 
		        	  System.out.println("Successfully Deleted!");
		          } else {
		        	  System.out.println("No Record Found!");
		          }
		        
				break;
			case 3:
				 ArrayList<Student> list = (ArrayList)session.createQuery("From Student").list();
			        for(Student i : list) {
			      	  System.out.println(i);
			        } 
				break;
			case 4:
				System.out.print("Enter the Id to be Updated : ");
				int n1 = sc.nextInt();
				Student s2 = session.find(Student.class,n1);
				if(s2!=null) {
					System.out.print("Enter the Name,City : ");
					s2.setName(sc.next());
					s2.setCity(sc.next());
					session.update(s2);
			        System.out.print("Record Update Successfully!");
				}
				break;
			case 5:
				
				System.out.print("Enter the Student ID to be Display : ");
				int id2 = sc.nextInt();
				
				Student s3 = session.find(Student.class,id2);
				if(s3 != null) {
		        	  System.out.println(s3);
		          } else {
		        	  System.out.println("No Record Found!");
		          }

				break;	
			
			case 6:
				
				System.out.print("Thanks For Using Our Application!");
				return;
		  }
		System.out.println(" ");
		System.out.println("Do you Wish to Continue(Yes/No) : ");
		ch = sc.next();
		System.out.println(" ");
		}while(ch.equalsIgnoreCase("yes"));
		
		tx.commit();
    	
    }
}
