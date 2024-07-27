package com.lms.main;
import java.sql.SQLException;
import java.util.Scanner;

import com.lms.bean.Employee;
import com.lms.dao.LMSDAO;
public class LMSmain 
{
	static Scanner sc = new Scanner (System.in);
	public static int displayMenu()
	{
		int choice;
		System.out.println("---------------MENU-------------------");
		System.out.println("1. Insert");
		System.out.println("2. Delete");
		System.out.println("3. ViewAll");
		System.out.println("4. Update");
		System.out.println("5. Find");
		System.out.println("6. Find By Name");
		System.out.println("7. Find By Designation");
		System.out.println("8. Find By Department");
		System.out.println("9. Exit");
		System.out.println("--------------------------------------");
		System.out.println("Enter your choice : ");
		choice = sc.nextInt();
		return choice;
	}
	
	public static Employee insert()
	{
		System.out.println("Enter the Emp. Id, Emp. Name, Emp. Designation, Emp. Department");
		return (new Employee(sc.nextInt(), sc.next(), sc.next(), sc.next()));
	}
	
	public static Employee update()
	{
		System.out.println("Enter the Emp. Id, Emp. Name, Emp. Designation, Emp. Department");
		return (new Employee(sc.nextInt(), sc.next(), sc.next(), sc.next()));
	}
	
	public static void main (String[] args) throws SQLException
	{
		LMSDAO dao = new LMSDAO();
		String ch;
	do
	{
		switch (displayMenu())
		{
		
		case 1:
			Employee e = insert();
			int m = dao.doInsert(e);
			if(m>0)
			{
				System.out.println("Record Inserted Successfully...");
			}
			else
			{
				System.out.println("Failed to Insert... Kindly Retry...");
			}
			break;
			
		case 2:
			System.out.println("Enter the id to delete the record : ");
			int id = sc.nextInt();
			int m2 = dao.doDelete(id);
			if(m2>0)
			{
				System.out.println("Record Deleted Successfully...");
			}
			else
			{
				System.out.println("Record Not Found...");
			}
			break;
			
		case 3:
			int n = dao.viewAll();
			if(n<=0)
			{
				System.out.println("No Records Found");
			}
			break;
			
		case 4:
			Employee f = update();
			int m4 = dao.doUpdate(f);
			if(m4>0)
			{
				System.out.println("Record Updated Successfully...");
			}
			else
			{
				System.out.println("Failed to Update... Kindly Retry...");
			}
			break;
			
		case 5:
			System.out.println("Enter the id to find the record : ");
			int id2 = sc.nextInt();
			int m5 = dao.doFind(id2);
			if(m5>0)
			{
				System.out.println("Record Found Successfully...");
			}
			else
			{
				System.out.println("Record Not Found...");
			}
			break;
			
		case 6:
			System.out.println("Enter the name to find the record : ");
			String name = sc.next();
			int m6 = dao.doFindByName(name);
			if(m6>0)
			{
				System.out.println("Record Found Successfully...");
			}
			else
			{
				System.out.println("Record Not Found...");
			}
			break;
		case 7:
			System.out.println("Enter the Designation to find the record : ");
			String desig = sc.next();
			int m7 = dao.doFindByDesig(desig);
			if(m7>0)
			{
				System.out.println("Record Found Successfully...");
			}
			else
			{
				System.out.println("Record Not Found...");
			}
			break;
		case 8:
			System.out.println("Enter the Department to find the record : ");
			String depart = sc.next();
			int m8 = dao.doFindByDepart(depart);
			if(m8>0)
			{
				System.out.println("Record Found Successfully...");
			}
			else
			{
				System.out.println("Record Not Found...");
			}
			break;
		case 9:
			break;
		}
		System.out.println("Do u wish to continue (yes / no) : ");
		ch = sc.next();
	}
	while(ch.equalsIgnoreCase("yes"));
	}
}
