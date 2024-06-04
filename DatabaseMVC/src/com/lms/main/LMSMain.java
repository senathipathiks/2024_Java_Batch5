package com.lms.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.lms.bean.Employee;
import com.lms.dao.LMSDAO;

public class LMSMain {
	
	static Scanner sc = new Scanner(System.in);
	public static int displayMenu()
	{
		
		int choice;
		System.out.println("--------------Menu---------------");
		System.out.println("1. Insert");
		System.out.println("2. Delete");
		System.out.println("3. ViewAll");
		System.out.println("4. Update");
		System.out.println("5. Find");
		System.out.println("6. FindByName");
		System.out.println("7. Exit");
		System.out.println("----------------------------------");
		choice = sc.nextInt();
		return choice;
	}
	
	
	public static Employee insert()
	{
		System.out.println("Enter the Emp ID, Name, Designation and Dept");
		return(new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next()));
		

	}
	
	public static Employee update()
	{
		System.out.println("Enter the Emp ID, Name, Designation and Dept for update");
		return(new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next()));
		

	}
	
	
	
	
	public static void main(String args[]) throws SQLException
	{
		LMSDAO dao = new LMSDAO();
		String ch;
		do {
			
		
		switch(displayMenu())
		{
		case 1:
			Employee e=insert();
			int n=dao.doInsert(e);
			if(n>0)
			{
				System.out.println("Record inserted sucessfully");
			}
			else
			{
				System.out.println("Record Insertion Failed");
			}
			break;
		case 2:
			System.out.println("Enter the employee id to be deleted");
			int id=sc.nextInt();
			n=dao.doDelete(id);
			if(n>0) 
			{
				System.out.println("Record deleted successfully");
			}
			else
			{
				System.out.println("Record Not found");
			}
			break;
		case 3:
			int a = dao.viewAll();
			if(a<=0)
			{
				System.out.println("No recors found");
			}
			break;
		case 4: 
			Employee e1=update();
			int n2=dao.doUpdate(e1);
			if(n2>0)
			{
				System.out.println("Record updated sucessfully");
			}
			else
			{
				System.out.println("Record updation failed");
			}
			break;
		case 5:
			System.out.println("Enter the employee Id to be searched");
			int id2=sc.nextInt();
			n=dao.doFind(id2);
			if(n>0)
			{
				System.out.println("ID Found");
			}
			else
			{
				System.out.println("ID Not Found");
			}
			break;
		
		case 6:
		
			System.out.println("Enter the employee Name to be searched");
			String s=sc.next();
			n=dao.doFindByName(s);
			if(n>0)
			{
				System.out.println("Name Found");
			}
			else
			{
				System.out.println("Name Not Found");
			}
			break;
		}
		
			
		System.out.println("Do you Wish to continue:(Yes/No)");
		ch=sc.next();
		}while(ch.equalsIgnoreCase("yes"));
	}

}
