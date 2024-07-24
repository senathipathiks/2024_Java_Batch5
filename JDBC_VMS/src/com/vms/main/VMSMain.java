package com.vms.main;

import java.sql.SQLException;
import java.util.Scanner;


import com.vms.bean.Vehicle;
import com.vms.dao.VMSDAO;
import com.vms.bean.Vehicle;
import com.vms.dao.VMSDAO;

public class VMSMain 
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
		   //System.out.println("-----------------");
		   choice=sc.nextInt();
		   return choice;
	   }
	   
	   public static Vehicle insert()
	   {
		   System.out.println("Enter the Vehicleid,VehicleBrandName,VehicleOwnerName,VehicleServiceList");
		   return (new Vehicle(sc.nextInt(),sc.next(),sc.next(),sc.next()));
	   }
	   
	   public static Vehicle update()
	   {
		   System.out.println("Enter the Vehicleid,VehicleBrandName,VehicleOwnerName,VehicleServiceList");
		   return (new Vehicle(sc.nextInt(),sc.next(),sc.next(),sc.next()));
	   }
	   public static void main(String args[]) throws SQLException
	   {
		   VMSDAO dao=new VMSDAO();
		   String ch;
		   //int n;
		   do {
		   switch(displayMenu())
		   {
		   case 1:
			   Vehicle v = insert();
			   int n=dao.doInsert(v);
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
			   System.out.println("Enter the Vehicleid:");
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
			   Vehicle v1=update();
			   int n2=dao.doUpdate(v1);
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
			   System.out.println("Enter the Vehicleid:");
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
		   }
	    System.out.println("Do you want to continue:(Yes/No)");
	   ch=sc.next();
	   
   }while(ch.equalsIgnoreCase("yes"));
}
}
