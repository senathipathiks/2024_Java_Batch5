package com.lms.main;

import java.sql.SQLException;
import java.util.Scanner;
import com.lms.bean.Employee;
import com.lms.dao.LMSDAO;

public class LMSMain 
{
   static Scanner sc=new Scanner(System.in);
   public static int displayMenu()
   {
	   int choice;
	   System.out.println("-----MENU-----");
	   System.out.println("1.Insert");
	   System.out.println("2.Delete");
	   System.out.println("3.ViewAll");
	   System.out.println("4.Update");
	   System.out.println("5.FindByid");
	   System.out.println("6.FindByname");
	   System.out.println("7.FindBydesig");
	   System.out.println("8.FindByDept");
	   //System.out.println("-----------------");
	   choice=sc.nextInt();
	   return choice;
   }
   
   public static Employee insert()
   {
	   System.out.println("Enter the Emp ID,Name,Desig,Dept");
	   return (new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next()));
   }
   
   public static Employee update()
   {
	   System.out.println("Enter the Emp ID,Name,Desig,Dept");
	   return (new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next()));
   }
   public static void main(String args[]) throws SQLException
   {
	   LMSDAO dao=new LMSDAO();
	   String ch;
	   //int n;
	   do {
	   switch(displayMenu())
	   {
	   case 1:
		   Employee e = insert();
		   int n=dao.doInsert(e);
		   if(n>0)
		   {
			   System.out.println("Record Inserted Successfully");
		   }
		   else
		   {
			   System.out.println("Failed to insert Record");
		   }
		   break;
	   case 2:
		   System.out.println("Enter the Emp ID:");
		   int id=sc.nextInt();
		   n=dao.dodelete(id);
		   if(n>0)
		   {
			   System.out.println("Record deleted sucessfully");
		   }
		   else
		   {
			   System.out.println("Record not found");
		   }
		   break;
	   case 3:
		   int n1=dao.viewAll();
		   if(n1<=0)
		   {
			   System.out.println("No records found");
		   }
		   break;
	   case 4:
		   Employee e1=update();
		   int n2=dao.doUpdate(e1);
		   if(n2>0)
		   {
			   System.out.println("Record updated successfully");
		   }
		   else
		   {
			   System.out.println("Failed to update record");
		   }
		   break;
	   case 5:
		   System.out.println("Enter the Emp ID:");
		   int id1=sc.nextInt();
		   n=dao.doFind(id1);
		   if(n>0)
		   {
			   System.out.println("Record found");
		   }
		   else
		   {
			   System.out.println("Record not found");
		   }
		   break;
	   case 6:
		   System.out.println("Enter the Emp Name:");
		   String id2 = sc.next();
		   n=dao.doFindByName(id2);
		   if(n>0)
		   {
			   System.out.println("Record found");
		   }
		   else
		   {
			   System.out.println("Record not found");
		   }
		   break;
	   case 7:
		   System.out.println("Enter the Emp Desig:");
		   String id3 = sc.next();
		   n=dao.doFindByDesig(id3);
		   if(n>0)
		   {
			   System.out.println("Record found");
		   }
		   else
		   {
			   System.out.println("Record not found");
		   }
		   break;
	   case 8:
		   System.out.println("Enter the Emp Desig:");
		   String id4 = sc.next();
		   n=dao.doFindByDept(id4);
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
	   
	   System.out.println("Do you want to continue:(Yes/No)");
	   ch=sc.next();
	   
   }while(ch.equalsIgnoreCase("yes"));
}
}
