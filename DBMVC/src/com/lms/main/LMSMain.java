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
		System.out.println("-----------MENU------------");
		System.out.println("1.Insert");
		System.out.println("2.Delete");
		System.out.println("3.ViewAll");
		System.out.println("4.Update");
		System.out.println("5.Find  by id");
		System.out.println("6.Find  by name");
		System.out.println("7.Exit");
		System.out.println("----------------------------");
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
		System.out.println("Enter the Emp ID, Name, Designation and Dept for the updation");
		return(new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next()));
	}
	
	public static void main(String s[])throws SQLException
	{
		LMSDAO dao = new LMSDAO();
		String ch;
		String name;
		int id;
		int n;
		do
		{
		switch(displayMenu())
		{
		case 1 :
			Employee e = insert();
			n = dao.doInsert(e);
			if(n>0)
			{
				System.out.println("Record inserted successfully");
			}
			else
			{
				System.out.println("Record insertion failure");
			}
			break;
		case 2 :
			System.out.println("enter the employee ID to be deleted");
			id = sc.nextInt();
			n = dao.doDelete(id);
			if(n>0) {
				System.out.println("Record Deleted Successfully");
			}
			else 
			{
				System.out.println("Record not found");
			}
			break;
		case 3 :
			n = dao.viewAll();
			if(n<=0)
			{
				System.out.println("No Records Found");
			}
			break;
		case 4 :
			Employee e1 = update();
			n = dao.doUpdate(e1);
			if(n>0)
			{
				System.out.println("Record updated successfully");
			}
			else
			{
				System.out.println("Record updation failure");
			}
			break;
		case 5 :
			System.out.println("enter the employee ID to find");
			id = sc.nextInt();
			n = dao.doFind(id);
			if(n>0)
			{
				System.out.println("Record found");
			}
			else
			{
				System.out.println("Record not found");
			}
			break;
		case 6 :
			System.out.println("enter the name to find");
			name = sc.next();
			n = dao.doFindName(name);
			if(n>0)
			{
				System.out.println("Record found");
			}
			else
			{
				System.out.println("Record not found");
			}
			break;
		}
		System.out.println("do you wish to continue : (Yes/No)");
		ch = sc.next();
		}while(ch.equalsIgnoreCase("yes"));
	}

}
