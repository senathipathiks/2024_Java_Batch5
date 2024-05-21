package com.obcps.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.obcps.bean.People;
import com.obcps.dao.OBCPSDAO;

public class OBCMain {
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
	
	public static People insert()
	{
		System.out.println("Enter the Father Name, Mother Name, Child Name, Gender,Time of Birth, Place Of Birth: ");
		return(new People(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next()));
	}
	
	public static People update()
	{
		System.out.println("Enter the Father Name, Mother Name, Child Name, Gender,Time of Birth, Place Of Birth for Update");
		return(new People(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next()));
	}
	
	
	
	public static void main(String[] args) throws SQLException 
	{
		String ch;
		int n;
		String childName;
		OBCPSDAO dao = new OBCPSDAO();
		do {
			switch(displayMenu())
			{
				case 1:
					People e=insert();
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
					System.out.println("Enter the Child Name of record to be Deleted");
					childName=sc.next();
					n=dao.doDelete(childName);
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
					People e1=update();
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
					
					System.out.println("Enter the Child Name of Record you want to find: ");
					childName=sc.next();
					n=dao.doFindByName(childName);
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
