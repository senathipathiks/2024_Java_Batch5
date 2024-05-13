package com.lms.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.lms.bean.Employee;
import com.lms.dao.LMSDAO;

public class LMSMain {

	static Scanner sc = new Scanner(System.in);
	
	public static int displayMenu()
	{
		System.out.println("------------------------Menu-------------------");
		System.out.println("1. Insert");
		System.out.println("2. Delete");
		System.out.println("3. ViewAll");
		System.out.println("4. Update");
		System.out.println("5. Find");
		System.out.println("6. FindByDepart");
		System.out.println("7. FindByName");
		System.out.println("8. FindByDesgination");
		System.out.println("9. Exit");
		System.out.println("-------------------------------------------------");
		System.out.println(" ");
		System.out.print("Enter your Choice : ");
		int choice  = sc.nextInt();
		System.out.println(" ");
		return choice;	
	}

	public static Employee insert()
	{
		System.out.print("Enter the Emp Id, Name, Designation and Dept for update");
		return(new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next()));
	}
	
	public static Employee update()
	{
		System.out.print("Enter the Emp Id, Name, Designation and Dept");
		return(new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next()));
	}
	
	public static void main(String s[]) throws SQLException {
		
		LMSDAO dao = new LMSDAO();
		String ch;
		do {
			
		switch(displayMenu())
		{
			case 1:
				Employee e = insert();
				int n = dao.doInsert(e); 
				if(n>0)
				{
					System.out.print("Record Inserted Successfully!");
				}
				else {
					System.out.print("Record Insertion Failure!");
				}
				break;
			case 2:
				System.out.print("Enter the Employee ID to be Deleted : ");
				int id = sc.nextInt();
				n = dao.doDelete(id);
				if(n>0)
				{
					System.out.print("Record Deleted Successfully!");
				}
				else {
					System.out.print("Record Deletion Failure!");
				}
				break;
			case 3:
				int n1 = dao.viewAll();
				if(n1<=0)
				{
					System.out.print("No records Found");
				}
				break;
			case 4:
				
				Employee e1 = update();
				int n2 = dao.doUpdate(e1);
				if(n2>0)
				{
					System.out.print("Record Update Successfully!");
				} else {
					System.out.print("Record Updation Failure!");
				}
				break;
			case 5:
				
				System.out.print("Enter the Employee ID to be Display : ");
				int id2 = sc.nextInt();
				
				int n4 = dao.doFind(id2);
				
				if(n4<=0)
				{
					System.out.print("No records Found");
				}
				break;	
			case 6:
				
				System.out.print("Enter the Employee Department to be Display : ");
				String dept = sc.next();
				
				int n5 = dao.doFindDept(dept);
				
				if(n5<=0)
				{
					System.out.print("No records Found");
				}
				break;
				
			case 7:
				
				System.out.print("Enter the Employee Name to be Display : ");
				String name = sc.next();
				
				int n6 = dao.doFindName(name);
				
				if(n6<=0)
				{
					System.out.print("No records Found");
				}
				break;	
				
			case 8:
				
				System.out.print("Enter the Employee Designation to be Display : ");
				String Desg = sc.next();
				
				int n7 = dao.doFindDesg(Desg);
				
				if(n7<=0)
				{
					System.out.print("No records Found");
				}
				break;	
			case 9:
				
				System.out.print("Thanks For Using Our Application!");
				return;
		  }
		System.out.println(" ");
		System.out.println("Do you Wish to Continue(Yes/No) : ");
		ch = sc.next();
		System.out.println(" ");
		}while(ch.equalsIgnoreCase("yes"));
	}

}
