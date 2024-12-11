package com.lms.main;

import java.sql.SQLException;
import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifGPSTagSet;

import com.lms.bean.Employee;
import com.lms.dao.LmsDao;


public class LMSMain {
	static Scanner scanner = new Scanner(System.in);
	public static int displaymenu() {
		System.out.println("----------------MENU---------------------------");
		System.out.println("1.Insert");
		System.out.println("2.Delete");
		System.out.println("3.ViewAll");
		System.out.println("4.Update");
		System.out.println("5.Find");
		System.out.println("6.Find By Name");
		System.out.println("7.Exit");
		System.out.println("--------------------------------------------------");
		System.out.println();
		
		System.out.println("Enter your choice");
		
		int ch=scanner.nextInt();
		return ch;
		
	}
 public static Employee insert() {
	
	 System.out.println("Enter Emp id,Name,Desigantion,Salary");
	 return (new Employee(scanner.nextInt(),scanner.next(),scanner.next(),scanner.nextInt()));
}
 
 public static Employee update() {
	 

	 System.out.println("Enter Emp id,Name,Desigantion,Salary for Update");
	 return (new Employee(scanner.nextInt(),scanner.next(),scanner.next(),scanner.nextInt()));
}
 
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
  LmsDao dao = new LmsDao();
  String cho;
  do {
	  switch(displaymenu()) {
	  
	  case 1:{
		  Employee e = insert();
		  int n = dao.doinsert(e);
		  if(n>0) {
			  System.out.println(" Record Inserted Successfully");
		  }
		  else {
			  System.out.println("Record Insertion Failed");
		  }
		  break;
	  }
	  
	  
	case 2:{
		System.out.println("Enter Employee Id to delete ");
	    int id = scanner.nextInt();
	     int n = dao.dodelete(id);
	    if(n>0) {
	    	System.out.println("Record succesfully deleted");
	    	
	    }
	    else {
	    	System.out.println("Record not found");
	    }
		  
		  break;
	  }

//	case 3:{
////		 int n =dao.viewAll();
//		  if(n<=0) {
//			  System.out.println("No records found");
//		  }
//		  
//		  break;
//	}

	case 4:{
		  Employee e1  = update();
		  int n2= dao.doupdate(e1);
		  if(n2>0) {
			  System.out.println("Record updated Successfully");
			  
		  }
		  else {
			  System.out.println("Updation failed");
		  }
		  break;
	}

	case 5:{
//		System.out.println("Enter Employee Id to Search... ");
//	    int id = scanner.nextInt();
//	     int n = dao.dofind(id);
//	    if(n>0) {
//	    	System.out.println("Record Found");
//	    	
//	    }
//	    else {
//	    	System.out.println("Record not found");
//	    }
		  
		  break;
	  }
		 
	case 6:{
		
		
//		System.out.println("Enter Employee Name to Search ... ");
//    String empname = scanner.next();
//    int n = dao.dofindbyName(empname);
//   if(n>0) {
//   	System.out.println("Record Found");
//   	
//   }
//   else {
//   	System.out.println("Record not found");
//   }
	  
	  break;
	}
	case 7:{
		
		break;
	}
	default:
		System.out.println("Enter Valid Choice");

	  }
	  System.out.println("Do you want to continue ? Y?N : ");
	  cho=scanner.next();
} while (cho.equalsIgnoreCase("y"));
  
  
  
	}

}
