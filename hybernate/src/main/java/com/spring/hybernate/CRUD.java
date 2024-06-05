package com.spring.hybernate;

import java.awt.Menu;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUD {

  static Scanner s = new Scanner(System.in);
   static Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Subject.class);
   static SessionFactory sf = cfg.buildSessionFactory();
   static Session session =sf.openSession();
   static  Transaction tx = session.beginTransaction();
	
   public static int  Menu() {
	   int choice; 
	   String ch;
	   
		   
		   System.out.println("----------------------Select Operation------------------------------");
		   System.out.println("1.Add Student");
		   System.out.println("2.Delete Student");
		   System.out.println("3.Update Student");
		   System.out.println("4.Display Student");
		   System.out.println("5.Find by ID");
		   System.out.println("6.Exit");
		   System.out.println("---------------------------------------------------------------------");
		  System.out.println("Enter your choice :");
		   choice=s.nextInt() ;
	
	   
	     return choice;
	   
	   
   }
   
   
   
   public static void main (String args[]) {
	   
	   String ch;
	   do {
		   switch(Menu())
			{
				case 1:
					System.out.print("Enter the id,Name,City : ");
					Student s1 = new Student(s.nextInt(),s.next(),s.next());
			        session.save(s1);
			        
			        System.out.print("Inserted Successfully!");
					break;
				case 2:
					System.out.print("Enter the Id to be Deleted : ");
					int n = s.nextInt();
					 Student s11 = session.find(Student.class,n);
			          if(s11 != null) {
			        	  session.delete(s11); 
			        	  System.out.println("Successfully Deleted!");
			          } else {
			        	  System.out.println("No Record Found!");
			          }
					break;
				case 3:
					System.out.print("Enter the Id to be Updated : ");
					int n1 = s.nextInt();
					Student s2 = session.find(Student.class,n1);
					if(s2!=null) {
						System.out.print("Enter the Name,City : ");
						s2.setName(s.next());
						s2.setCity(s.next());
						session.update(s2);
				        System.out.print("Record Update Successfully!");
					}
					break;
				case 4:
					 ArrayList<Student> list = (ArrayList)session.createQuery("From Student").list();
				        for(Student i : list) {
				      	  System.out.println(i);
				        } 
					break;
				
				case 5:
					System.out.print("Enter the Employee ID to be Display : ");
					int id2 = s.nextInt();
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
		   
		   System.out.println("Do you want to continue ?? YES | NO ");
		   ch = s.next();
	   }while(ch.equalsIgnoreCase("yes"));
	   tx.commit();
	   
	   
   }
	
}
