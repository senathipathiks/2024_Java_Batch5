package com.lms.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.lms.bean.Employee;
import com.lms.dao.LmsDao;

public class LMSMain {
	static Scanner sc = new Scanner(System.in);
	public static int displayMenu() {
		int choice;
		System.out.println("-----------------Menu-----------------");
		System.out.println(" 1.Insert\n 2.ViewAll\n 3.Update\n 4.Delete\n 5.Find by ID\n 6.Find by Name\n 7.Find by Designation\n 8.Find by Department\n 9.Exit \nEnter your Option:");
		choice = sc.nextInt();
		return choice;
	}

	public static Employee insert() {
		System.out.println("Enter the Emp ID, Emp Name, Emp Deisgnation, Emp Department:");
		return(new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next()));
	}
	
	public static Employee update() {
		System.out.println("Enter the Emp ID, Emp Name, Emp Deisgnation, Emp Department:");
		return(new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next()));
	}
	
	public static Employee findName() {
		System.out.println("Enter the Emp ID, Emp Name, Emp Deisgnation, Emp Department:");
		return(new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next()));
	}
	
	
	public static void main(String s[]) throws SQLException {
		LmsDao dao = new LmsDao();
		String ch;
		do {
			switch(displayMenu()) {
			
			case 1:
				Employee e = insert();
				int in = dao.doInsert(e);
				if(in>0) {
					System.out.println("Record Inserted Successfully!!!");
				}
				else {
					System.out.println("Record Insertion Failed!!!");
				}
				break;
				
			case 2:
				int n = dao.viewAll();
				if(n<=0) {
					System.out.println("No Records Found!!!");
				}
				break;
				
			case 3:
				Employee e1 = update();
				int up = dao.doUpdate(e1);
				if(up>0) {
					System.out.println("Record Updated Successfully...");
				}
				else {
					System.out.println("Failure in Updation");
				}
				break;
				
			case 4:
				System.out.println("Enter the ID to delete:");
				int id = sc.nextInt();
				int del = dao.doDelete(id);
				if(del>0) {
					System.out.println("Record Deleted successfully...");
				}
				else {
					System.out.println("Failure in Deletion!!!");
				}
				break;
			case 5:
				System.out.println("Enter the Employee ID to Find:");
				int fid = sc.nextInt();
				int fin = dao.doFind(fid);
				if(fin>0) {
					System.out.println("Record Found!!!");
				}
				else {
					System.out.println("Record not found");
				}
				
				break;
				
			case 6:
				System.out.println("Enter the Employee Name to Find:");
				String ename = sc.next();
				int fname = dao.doFindName(ename);
				if(fname<=0) {
					System.out.println("Record not found");
				}
				else {
					System.out.println("Record Found!!!");
				}
				break;
				
			case 7:
				System.out.println("Enter the Employee Designation to Find:");
				String edes = sc.next();
				int fdes = dao.doFindPos(edes);
				if(fdes>0) {
					System.out.println("Record Found!!!");
				}
				else {
					System.out.println("Record not found");
				}
				
				break;
				
			case 8:
				System.out.println("Enter the Employee Department to Find:");
				String edep = sc.next();
				int fdep = dao.doFindDep(edep);
				if(fdep>0) {
					System.out.println("Record Found!!!");
				}
				else {
					System.out.println("Record not found");
				}
				
				break;
				
			case 9:
				System.out.println("Bye bye...Exitted");
				System.exit(0);
			}
			System.out.println();
			System.out.println("Do you want to continue (Yes | No) ?:");
			ch = sc.next();
		} while(ch.equalsIgnoreCase("yes"));
	}
}
