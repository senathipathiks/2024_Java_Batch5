package com.visitor.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.visitor.beans.Visitors;
import com.visitor.dao.VisitorDao;

public class VisitorMain {
		static Scanner sc = new Scanner(System.in);
		public static int displayMenu() {
			int choice;
			System.out.println("-----------------Menu-----------------");
			System.out.println(" 1.ViewAll\n 2.Insert\n 3.Update\n 4.Delete\n 5.Find by Visitor ID\n 6.Find by Visitor Name\n 7.Find by Employee Name\n 8.Exit \nEnter your Option:");
			choice = sc.nextInt();
			return choice;
		}

		public static Visitors insert() {
			System.out.println("Enter the Visitor ID, Visitor name, Visitor Phone number, Visit Purpose, Visitor Address, Employee Name, Employee Designation:");
			return(new Visitors(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next()));
		}
		
		public static Visitors update() {
			System.out.println("Enter the Visitor ID, Visitor name, Visitor Phone number, Visit Purpose, Visitor Address, Employee Name, Employee Designation:");
			return(new Visitors(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next()));
		}
		
		public static Visitors findName() {
			System.out.println("Enter the Visitor ID, Visitor name, Visitor Phone number, Visit Purpose, Visitor Address, Employee Name, Employee Designation:");
			return(new Visitors(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next()));
		}
				
		public static Visitors findEmpName() {
			System.out.println("Enter the Visitor ID, Visitor name, Visitor Phone number, Visit Purpose, Visitor Address, Employee Name, Employee Designation:");
			return(new Visitors(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next()));
		}
		
		
		
		public static void main(String s[]) throws SQLException {
			VisitorDao dao = new VisitorDao();
			String ch;
			do {
				switch(displayMenu()) {
				
				case 1:
					int n = dao.viewAll();
					if(n<=0) {
						System.out.println("No Records Found!!!");
					}
					break;
					
				case 2:
					Visitors v = insert();
					int in = dao.doInsert(v);
					if(in>0) {
						System.out.println("Record Inserted Successfully!!!");
					}
					else {
						System.out.println("Record Insertion Failed!!!");
					}
					break;

				case 3:
					Visitors upd = update();
					int up = dao.doUpdate(upd);
					if(up>0) {
						System.out.println("Record Updated Successfully...");
					}
					else {
						System.out.println("Failure in Updation");
					}
					break;
					
				case 4:
					System.out.println("Enter the Visitor's ID to delete:");
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
					System.out.println("Enter the Visitor's ID to Find:");
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
					System.out.println("Enter the Employee name to Find:");
					String fename = sc.next();
					int fenamede = dao.doFindEmp(fename);
					if(fenamede>0) {
						System.out.println("Record Found!!!");
					}
					else {
						System.out.println("Record not found");
					}
					
					break;
					
				case 8:
					System.out.println("Thank You! Visit Again!!!");
					System.exit(0);
				}
				System.out.println();
				System.out.println("Do you want to continue (Yes | No) ?:");
				ch = sc.next();
			} while(ch.equalsIgnoreCase("yes"));
		}
	}
