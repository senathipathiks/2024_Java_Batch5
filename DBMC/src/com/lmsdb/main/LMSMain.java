package com.lmsdb.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.lmsdb.bean.Employee;
import com.lmsdb.dao.LMSDAO;

public class LMSMain {
	static Scanner sc=new Scanner(System.in);
	public static int displayMenu()
	{
		int choice;
		System.out.println("-------------MENU--------------");
		System.out.println("1. Insert");
		System.out.println("2. Delete");
		System.out.println("3. ViewAll");
		System.out.println("4. Update");
		System.out.println("5. Find");
		System.out.println("6. Exit");
		System.out.println("-------------------------------");
		choice=sc.nextInt();
		return choice;
	}
	
	public static Employee insert()
	{
		System.out.println("Enter the Emp ID, Name , Designation and Dept");
		return(new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next()));
	}
	
	public static Employee update()
	{
		System.out.println("Enter the Emp ID, Name , Designation and Dept for Update");
		return(new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next()));
	}
	
	
	
	public static void main(String[] args) throws SQLException 
	{
		String ch;
		int n;
		int id;
		LMSDAO dao = new LMSDAO();
		do {
			switch(displayMenu())
			{
				case 1:
					Employee e=insert();
					n=dao.doInsert(e);
					if(n>0)
					{
						System.out.println("Record Inserted Successfully");
					}
					else {
						System.out.println("Record Insertion Failure");
					}
					break;
				case 2:
					System.out.println("Enter the Employee ID to be Deleted");
					id=sc.nextInt();
					n=dao.doDelete(id);
					if(n>0)
					{
						System.out.println("Record Deleted Successfully");
					}
					else {
						System.out.println("Record Not Found");
					}
					break;
				case 3:
					n=dao.viewAll();
					if(n<=0)
					{
						System.out.println("No records Found");
					}
					break;
				case 4:
					Employee e1=update();
					n=dao.doUpdate(e1);
					if(n>0)
					{
						System.out.println("Record Updated Successfully");
					}
					else {
						System.out.println("Record Updation Failure");
					}
					break;
				case 5:
					
					System.out.println("Enter the Emp ID of Record you want to find: ");
					id=sc.nextInt();
					n=dao.doFindByID(id);
					if(n<=0)
					{
						System.out.println("No records Found");
					}
					break;
			}
			System.out.println("Do you wish to continue:(yes/no)");
			ch=sc.next();
		}while(ch.equalsIgnoreCase("yes"));
		
	}

}
