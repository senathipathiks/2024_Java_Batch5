package com.lms.main;

import java.util.*;

import com.lms.bean.pdt;
import com.lms.dao.LMSDAO;

import java.sql.*;

public class LMSMain {

	static Scanner sc = new Scanner(System.in);

	public static int displayMenu() {

		System.out.println("----------MENU---------");
		System.out.println("1.insert pdt");
		System.out.println("2.delete pdt");
		System.out.println("3.ViewAll pdt");
		System.out.println("4.Update pdt");
		System.out.println("5.search pdt ");
		System.out.println("6. Exit ");
		System.out.println("------------------------");
		int choice = sc.nextInt();
		return choice;

	}

	public static pdt doInsert() {
		System.out.println("Enter pdt's ID , Name ,Brand, Category ");
		return (new pdt(sc.nextInt(),sc.next(),sc.next(),sc.next()));
	}
	
	public static pdt update() {
		System.out.println(" Enter pdtID to update the product");
		return(new pdt(sc.nextInt(),sc.next(),sc.next(),sc.next()));
	}
	public static void main(String[] args) throws SQLException {

		LMSDAO dao = new LMSDAO();
		int n,id;
		String name,x;
		String choice;
        do{
        	
		switch (displayMenu()) {

		case 1:
			pdt e=doInsert();
			n = dao.doInsert(e);
			if(n>0) {
				System.out.println("product inserted");
				
			}
			else {
				System.out.println("product insertion failed ");
				
			}
			
			break;

			
		case 2:
			
			System.out.println("Enter pdt's ID to delete product ");
			id=sc.nextInt();
			n=dao.delete(id);
			if(n>0) {
				System.out.println(" product deleted ");
			}
			else
			{
				System.out.println("product not found deletion failed ");
			}
			break;

			
		case 3:
			 n = dao.viewAll();
			if (n<=0 ) {
				
				System.out.println("no products found");

			}
			break;

			
		case 4:
			pdt e1=update();
			 n = dao.update(e1);
			if(n>0) {
				System.out.println("product updated");
				
			}
			else {
				System.out.println(" product updation failed ");
				
			}
			
			break;

		case 5:
			System.out.println("Enter pdt's ID to find product ");
			id=sc.nextInt();
			n=dao.find(id);
			if(n>0) {
				System.out.println("product found");
			}
			else
			{
				System.out.println("product not found ");
			}
				
			
			break;
			
		
		}
		
// find using name 		
//        case 5:
//			System.out.println("Enter pdt's Name to find product ");
//			name=sc.next();
//			n=dao.find(name);
//			if(n>0) {
//				System.out.println("product found");
//			}
//			else
//			{
//				System.out.println("product not found ");
//			}
//				
//			
//			break;
//        }
			
		
		System.out.println("do you want to continue (y/n)");
		choice=sc.next();
	}while(choice.equalsIgnoreCase("y"));

	}

}
