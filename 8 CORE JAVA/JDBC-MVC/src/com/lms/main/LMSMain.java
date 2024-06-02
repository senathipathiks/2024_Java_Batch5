package com.lms.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.lms.bean.Employee;
import com.lms.dao.LMSDAO;

public class LMSMain {
	static Scanner sc = new Scanner(System.in);
	public static int displayMenu() {
		int choice;
		
		System.out.println("-----MENU-------");
		System.out.println("1. Insert");
		System.out.println("2. Delete");
		System.out.println("3. View All");
		System.out.println("4. Update");
		System.out.println("5. Find By Id");
		System.out.println("6. Find By Name");
		System.out.println("7. Exit");
		choice = sc.nextInt();
		return choice;
	}
	
	public static Employee insert() {
		System.out.println("Enter the Emp ID, Name, Designation and Department");
		return (new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next()));
	}
	
	public static Employee update() {
		System.out.println("Enter the Emp ID, Name, Designation and Department for updation");
		return (new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next()));
	}
	
	
	public static void main(String args[]) throws SQLException {
		LMSDAO dao = new LMSDAO();
		String ch;
		int n;
		int id;
		String name;
		do{
		switch(displayMenu()) {
		case 1:
			Employee e = insert();
			n = dao.doInsert(e);
			if(n>0) {
				System.out.println("Record Inserted Successfully");
			}
			else {
				System.out.println("Record Insertion Failure");
			}
			break;
		case 2:
			System.out.println("Enter the EMP ID to delete");
			id = sc.nextInt();
			n = dao.doDelete(id);
			if(n>0) {
				System.out.println("Record Deleted Successfully");
			}
			else {
				System.out.println("Record Deletion Failure");
			}
			break;
		case 3:
			n = dao.viewAll();
			if(n<=0) {
				System.out.println("No Records Found ");
			}
			break;
		case 4:
			Employee e1 =update();
			n = dao.doUpdate(e1);
			if(n>0) {
				System.out.println("Record Updated Successfully");
			}
			else {
				System.out.println("Record Updation Failure");
			}
			break;
		case 5:
			System.out.println("Enter the EMP ID to Find");
			id = sc.nextInt();
			n = dao.doFindByID(id);
			if(n>0) {
				System.out.println("Record Found Successfully");
			}
			else {
				System.out.println("No Record Found");
			}
			break;
			
		case 6:
			System.out.println("Enter the EMP Name to Find");
			name = sc.next();
			n = dao.doFindByName(name);
			if(n>0) {
				System.out.println("Record Found Successfully");
			}
			else {
				System.out.println("No Record Found");
			}
			break;
		}
		System.out.println("Do  you want to continue (YES/NO)");
		ch = sc.next();
		}while(ch.equalsIgnoreCase("yes"));
	}
}
