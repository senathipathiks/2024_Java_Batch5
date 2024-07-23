package com.hiber.Hiber_Operations;

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
    public static void main( String[] args )
    {
    	Configuration con = new Configuration().configure("Books.cfg.xml").addAnnotatedClass(Books.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session s = sf.openSession();
    	Transaction tx = s.beginTransaction();
    	
    	
    	int bid = 0,cid=0;
    	String cname = null,bname = null,valid = null,cont;
    	
    	Scanner sc = new Scanner(System.in);
        int ch;
    	
    	System.out.println("\n\t\t***Library Management System***");
        System.out.println("Choose your options:\n 1.Insert\n 2.Update\n 3.Delete\n 4.Find\n 5.View All\n 6.Exit");
        ch=sc.nextInt();
        
        do {
	        switch(ch) {
	        case 1:
	        	System.out.println("***Insertion***");
	        	System.out.println("Enter Book ID, Book Name, Customer ID, Customer Name, Book Validity:");
	        	Books bIns = new Books(sc.nextInt(),sc.next(),sc.nextInt(),sc.next(),sc.next());
	        	s.save(bIns);
	        	System.out.println(bIns);
	        	break;
	        	
	        case 2:
	        	System.out.println("***Updation***");
	        	System.out.println("Enter Book ID:");
	        	int fid = sc.nextInt();
	        	Books bupf = s.find(Books.class, fid);
	        	System.out.println("Enter Book Name:");
	        	bname = sc.next();
	        	bupf.setBookname(bname);
	        	
	        	System.out.println("Enter Customer ID:");
	        	cid = sc.nextInt();
	        	bupf.setCustid(cid);
	        	
	        	System.out.println("Enter Customer Name:");
	        	cname = sc.next();
	        	bupf.setCustname(cname);
	        	
	        	System.out.println("Enter Book Validity:");
	        	valid = sc.next();
	        	bupf.setValidity(valid);
	        	
	        	s.update(bupf);
	        	s.save(bupf);
	        	tx.commit();
	        	break;
	        	
	        case 3:
	        	System.out.println("***Deletion***");
	        	ArrayList<Books> list = (ArrayList<Books>)s.createQuery("From Books").list();
	        	for(Books b : list) {
	        		System.out.println(b);
	        	}
	        	
	        	System.out.println("Enter Book ID to delete:");
	        	int delid = sc.nextInt();
	        	Books bookdel = s.find(Books.class, delid);
	        	s.delete(bookdel);
	        	System.out.println(bookdel);
	        	tx.commit();
	        	break;
	        	
	        case 4:
	        	System.out.println("***Find***");
	        	System.out.println("Enter Book ID to Find:");
	        	int fbookid = sc.nextInt();
	        	Books bookfind = s.find(Books.class, fbookid);
	        	System.out.println(bookfind);
	        	break;
	        	
	        case 5:
	        	System.out.println("***View All Option Selected***");
	        	System.out.println("Records are:");
	        	ArrayList<Books> viewlist = (ArrayList<Books>)s.createQuery("From Books").list();
	        	for(Books b : viewlist) {
	        		System.out.println(b);
	        	}
	        	break;
	        	
	        case 6:
	        	System.out.println("Thank you! Visit again!!!");
	        	System.exit(0);
	        	break;
	        }
	        System.out.println();
        	System.out.println("Do you want to Continue? ( Yes | No ): ");
        	cont = sc.next();
        }
        	while(cont.equalsIgnoreCase("yes"));
        }
    }										