package com.lms.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.lms.bean.Employee;
import com.lms.dao.LMSDAO;

public class LMSMain {
	static Scanner sc = new Scanner(System.in);
	public static int displayMenu() {
		int choice;
		System.out.println("------------------Leave Management System------------------");
		System.out.println("1. Insert");
		System.out.println("2. Delete");
		System.out.println("3. ViewAll");
		System.out.println("4. Update");
		System.out.println("5. Find by id");
		System.out.println("6. Find by name");
		System.out.println("7. Find by Designation");
		System.out.println("8. Find by Department");
		System.out.println("9. Exit");
		System.out.println("----------------------------------------------");
		choice = sc.nextInt();
		return choice;
	}
	public static Employee insert() {
		System.out.println("Enter the emp id, Name, Designation and Dept");
		return(new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next()));
		
	}
	public static Employee update() {
		System.out.println("Enter the emp id, Name, Designation and Dept for update");
		return(new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next()));
		
	}

	public static void main(String args[]) throws SQLException {
		LMSDAO dao = new LMSDAO();
		String msg;
		do {
			
		int find,d;
		String find1;
		switch(displayMenu()) {
			case 1:
				Employee e = insert();
				int n1 = dao.doInsert(e);
				if( n1 > 0) {
					System.out.println("Record Inserted Successfully");
				}
				else {
					System.out.println("Record Insertion Failure");
				}
				break;
			case 2:
				System.out.println("Enter the empid to delete:");
				int id = sc.nextInt();
				int n3 = dao.doDelete(id);
				if(n3 > 0) {
					System.out.println("Record Deleted successfully");
					
				}
				else {
					System.out.println("Record not found");
				}
				
				break;
			case 3:
				int n = dao.viewAll();
				if(n <= 0) {
					System.out.println("No records Found");
				}
				
				break;
			case 4:
				Employee e1 = update();
				int n2 = dao.doUpdate(e1);
				if( n2 > 0) {
					System.out.println("Record Updated Successfully");
				}
				else {
					System.out.println("Record Updatation Failure");
				}
				break;
			case 5:
				System.out.println("Enter the empid to find:");
				find = sc.nextInt();
				d = dao.doFind(find);
				if(d <= 0) {
					System.out.println("Record not found");
				}
				break;
			case 6:
				System.out.println("Enter the emp name to find:");
				find1 = sc.next();
				d = dao.doFind1(find1);
				if(d <= 0) {
					System.out.println("Record not found");
				}
				break;
			case 7:
				System.out.println("Enter the emp Designation to find:");
				find1 = sc.next();
				d = dao.doFind2(find1);
				if(d <= 0) {
					System.out.println("Record not found");
				}
				break;
			case 8:
				System.out.println("Enter the emp department to find:");
				find1 = sc.next();
				d = dao.doFind3(find1);
				if(d <= 0) {
					System.out.println("Record not found");
				}
				break;
			case 9:
				System.exit(0);
				break;
		
		}
		System.out.println("do you want to continue [Yes | No]");
		msg = sc.next();
		}while(msg.equalsIgnoreCase("yes"));
		
	}

}
