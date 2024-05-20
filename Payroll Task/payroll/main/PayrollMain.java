package com.payroll.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.payroll.bean.Leave;
import com.payroll.dao.PayrollDAO;


public class PayrollMain {

	static Scanner sc = new Scanner(System.in);
	
	public static int displayMenu()
	{
		System.out.println("------------------------Menu-------------------");
		System.out.println("1. Insert");
		System.out.println("2. Delete");
		System.out.println("3. Display");
		System.out.println("4. Update");
		System.out.println("5. FindById");
		System.out.println("6. FindByName");
		System.out.println("7. FindByDate");
		System.out.println("8. FindByReason");
		System.out.println("9. FindByLeaveType");
		System.out.println("10. Exit");
		System.out.println("-------------------------------------------------");
		System.out.println(" ");
		System.out.print("Enter your Choice : ");
		int choice  = sc.nextInt();
		System.out.println(" ");
		return choice;	
	}

	public static Leave insert()
	{
		System.out.print("Enter the Leave Id,Emp Id, Name, LType, NoOfDays, From_date, To_date, Reason :");
		return(new Leave(sc.nextInt(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.next(), sc.next(), sc.next()));
	}
	
	public static Leave update()
	{
		System.out.print("Enter the Leave Id,Emp Id, Name, LType, NoOfDays, From_date, To_date, Reason :");
		return(new Leave(sc.nextInt(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.next(), sc.next(), sc.next()));
		
	}
	
	public static void main(String s[]) throws SQLException {
		
		PayrollDAO dao = new PayrollDAO();
		String ch;
		do {
			
		switch(displayMenu())
		{
			case 1:
				Leave e = insert();
				int n = dao.Insert(e); 
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
				n = dao.Delete(id);
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
				
				Leave e1 = update();
				int n2 = dao.Update(e1);
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
				
				int n4 = dao.FindById(id2);
				
				if(n4<=0)
				{
					System.out.print("No records Found");
				}
				break;
			case 6:
				
				System.out.print("Enter the Employee Name to be Display : ");
				String name = sc.next();
				
				int n6 = dao.FindByName(name);
				
				if(n6<=0)
				{
					System.out.print("No records Found");
				}
				break;	
			case 7:
				
				System.out.print("Enter the Employee Leave Date to be Display : ");
				String dept = sc.next();
				
				int n5 = dao.FindLeaveDate(dept);
				
				if(n5<=0)
				{
					System.out.print("No records Found");
				}
				break;
			case 8:
				
				System.out.print("Enter the Employee Reason for Leave to be Display : ");
				String reason = sc.next();
				
				int n7 = dao.FindByReason(reason);
				
				if(n7<=0)
				{
					System.out.print("No records Found");
				}
				break;
			case 9:
				
				System.out.print("Enter the Leave Type to be Display : ");
				String Ltype = sc.next();
				
				int n9 = dao.FindByLeaveType(Ltype);
				
				if(n9<=0)
				{
					System.out.print("No records Found");
				}
				break;
				
			case 10:
				
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
