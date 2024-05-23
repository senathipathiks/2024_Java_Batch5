package com.lms.main;
import java.util.Scanner;
import java.sql.SQLException;
import com.lms.dao.LMSDAO;
import com.lmsbean.Employee;
public class LMSMain {
static Scanner sc=new Scanner(System.in);	
public static int displayMenu()
{
	int choice=0;
	System.out.println("------------MENU------------");
	System.out.println("1.Insert");
	System.out.println("2.Delete");
	System.out.println("3.ViewAll");
	System.out.println("4.Update");
	System.out.println("5.Find");
	System.out.println("6.Exit");
	System.out.println("-----------------------------");
	choice=sc.nextInt();
	return choice;	
}
public static Employee insert()
{
	System.out.println("Enter the EMP ID,Name,Designation,Department");
	return(new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next()));
}
public static Employee update()
{
	System.out.println("Enter the EMP ID,Name,Designation,Department for U"
			+ "3pdate");
	return(new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next()));
}
public static void main(String s[]) throws SQLException
{
	LMSDAO dao=new LMSDAO();
	String ch;
	int n;
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
		else
		{
			System.out.println("Record Insertion Failure");
		}
		break;
	case 2:
		System.out.println("Enter the id to be deleted");
		int id=sc.nextInt();
		n=dao.doDelete(id);
		if(n>0)
		{
		System.out.println("Record deleted successfully");	
		}
		else
		{
			System.out.println("Record deletion failed");
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
		else
		{
			System.out.println("Record Updation Failed");
		}
		break;
	case 5:
		
			
	}
	System.out.println("Do you wish to Continue:(Yes/No)");
	ch=sc.next();
}
while(ch.equalsIgnoreCase("yes"));
}
}

