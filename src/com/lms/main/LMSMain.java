package com.lms.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.lms.bean.Employee;
import com.lms.dao.LMSDAO;

public class LMSMain {
	static Scanner sc= new Scanner(System.in);
	public static int displayMenu()
	{	
		int choice;
		System.out.println("----MENU");
		System.out.println("1. Insert");
		System.out.println("2. Delete");
		System.out.println("3. ViewAll");
		System.out.println("4. Update");
		System.out.println("5. Find by ID");
		System.out.println("6. Find by Name");
		System.out.println("7. Find by Designation");
		System.out.println("8. Find by Department");
		System.out.println("9. Exit");
		System.out.println("--------");
		choice= sc.nextInt();
		return choice;

	}
	
	public static Employee insert()
	{
		System.out.println("Enter the Emp ID, Name, Designation and Dept");
		return(new Employee(sc.nextInt(),sc.next(), sc.next(), sc.next()));
	}
	public static Employee update()
	{
		System.out.println("Enter the Emp ID, Name, Designation and Dept for Update");
		return(new Employee(sc.nextInt(),sc.next(), sc.next(), sc.next()));
	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		LMSDAO dao= new LMSDAO();
		String ch;
		int id;
		int n;
		do {
			
		switch(displayMenu())
		{
			case 1:
				Employee e = insert();
				n=dao.doInsert(e);
				
				if(n>0)
				{
					System.out.println("Record inserted Successfully");
				}
				else
				{
					System.out.println("Record Insertion Failure");
				}
				break;
			case 2:
				System.out.println("Enter the employee ID to be deleted");
				id=sc.nextInt();
				n=dao.doDelete(id);
				if(n>0)
				{
					System.out.println("Record Deletesd Successfully");
				}
				else
				{
					System.out.println("Record Deletion Failure");
				}
				
				break;
			case 3:
				n =dao.viewAll();
				if(n<=0)
				{
					System.out.println("No records found");
				}
				break;
			case 4:
				Employee e1 = update();
				n=dao.doUpdate(e1);
				
				if(n>0)
				{
					System.out.println("Record updated Successfully");
				}
				else
				{
					System.out.println("Record updation Failure");
				}
				break;
			case 5:
				System.out.println("Enter the employee ID to find");
				id=sc.nextInt();
				n=dao.findbyId(id);
				
				if(n<=0)
				{
					System.out.println("Record Not Found");
				}
				
				break;
			case 6:
				System.out.println("Enter the employee name to find");
				String name =sc.next();
				n=dao.findbyName(name);
				
				if(n<=0)
				{
					System.out.println("Record Not Found");
				}
				
				break;
			case 7:
				System.out.println("Enter the employee desig to find");
				String desig =sc.next();
				n=dao.findbyDesig(desig);
				
				if(n<=0)
				{
					System.out.println("Record Not Found");
				}
				
				break;
			case 8:
				System.out.println("Enter the employee dept to find");
				String dept =sc.next();
				n=dao.findbyDept(dept);
				
				if(n<=0)
				{
					System.out.println("Record Not Found");
				}
				
				break;
			
		}
		System.out.println("DO you wish to continue:(Yes/No)");
		ch=sc.next();
	} while(ch.equalsIgnoreCase("yes"));
}
}
