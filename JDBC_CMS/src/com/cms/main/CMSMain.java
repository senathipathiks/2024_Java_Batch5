package com.cms.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.cms.dao.CMSDAO;

public class CMSMain 
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
//	   System.out.println("6.FindByname");
//	   System.out.println("7.FindBydesig");
//	   System.out.println("8.FindByDept");
//     System.out.println("-----------------");
	   choice=sc.nextInt();
	   return choice;
  }
  
  public static void main(String args[]) throws SQLException
  {
	  CMSDAO dao=new CMSDAO();
	  String ch;
	  int n;
	  switch(displayMenu())
	  {
	  case 1:
		  
		  break;
	  case 2:
		  break;
	  case 3:
		  n=dao.viewAll();
		   if(n<=0)
		   {
			   System.out.println("No records found");
		   }
		  break;
	  case 4:
		  break;
	  case 5:
		  break;
	  }
  }
}
