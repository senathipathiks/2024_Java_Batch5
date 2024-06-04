package com.crs.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.crs.bean.Student;
import com.crs.dao.CRSDAO;

public class CRSMain {
	
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
	
	public static Student insert()
	{
		System.out.println("Enter the Stud ID, Name,Dept and score");
		return(new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextInt()));
	}
	
	public static Student update()
	{
		System.out.println("Enter the Stud ID, Name,Dept and score for the updation");
		return(new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextInt()));
	}
	
	public static void main(String s[])throws SQLException
	{
		CRSDAO dao = new CRSDAO();
		String ch;
		String name;
		int id;
		int n;
		do
		{
		switch(displayMenu())
		{
		case 1 :
			Student s1 = insert();
			n = dao.doInsert(s1);
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
			System.out.println("enter the student ID to be deleted");
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
			Student e1 = update();
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
			System.out.println("enter the student ID to find");
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
