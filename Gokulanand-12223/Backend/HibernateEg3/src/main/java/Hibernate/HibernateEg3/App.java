package Hibernate.HibernateEg3;

import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    static Scanner sc = new Scanner(System.in);
    
	public static int Display()
    {
    System.out.println("1. Insert");
    System.out.println("2. Update");
    System.out.println("3. Delete");
    System.out.println("4. Find");
    System.out.println("5. View");
    System.out.println("--------------------------------------"); 
    System.out.println("Enter your choice : "); 
    int ch = sc.nextInt();
    return ch;
    }
	
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("Library.cfg.xml").addAnnotatedClass(Library.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session =  sf.openSession();
        Transaction tx = session.beginTransaction();
        
  
        int ch;
        
        do
        {
        switch (Display()) 
        {
		case 1:
			System.out.println("Enter Book id, Book name, Receiver id, Receiver name");
			Library lib = new Library(sc.nextInt(), sc.next(), sc.next(), sc.next());
			session.save(lib);
			System.out.println("Inserted Successfully...!");
			tx.commit();
			break;
			
		case 2:
			System.out.print("Enter the Book Id to be Updated : ");
			int id = sc.nextInt();
			Library libr = session.find(Library.class, id);
			if(id!=0) {
				System.out.print("Enter the Book name, Receiver id, Receiver name : ");
				libr.setBookname(sc.next());
				libr.setReceiverid(sc.next());
				libr.setReceivername(sc.next());
				session.update(libr);
		        System.out.print("Record Update Successfully!");
			}
			break;
			
		case 3:
			System.out.print("Enter the Id to be Deleted : ");
			int n = sc.nextInt();
			 Library library = session.find(Library.class, n);
	          if(library != null) {
	        	  session.delete(library); 
	        	  System.out.println("Successfully Deleted!");
	          } else {
	        	  System.out.println("No Record Found!");
	          }
			break;
			
		case 4:
			System.out.println("Enter Book id : ");
			int find = sc.nextInt();
			Library fin = session.find(Library.class, find);
			session.save(fin);
			System.out.println(fin);
			tx.commit();
			break;
			
		case 5:
			ArrayList<Library> list = (ArrayList)session.createQuery("From Library").list(); 
			System.out.println("---Library Management System---");
			for(Library employee : list) 
			{ 
				System.out.println(employee); 
			}
			tx.commit();
			break;
			
	  }

		System.out.println("Do you Wish to Continue(1/0) : ");
		ch = sc.nextInt();
		}while(ch==1);
		tx.commit();
	}
        
     }
