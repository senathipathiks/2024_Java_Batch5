package com.leave.main;

	 
	import com.leave.bean.Employee;
import com.leave.dao.*;
import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

import java.util.Scanner;
	 
	public class LMSMain {
		static Scanner sc = new Scanner(System.in);
		public static int menu() {
			int ch;
			System.out.println("-------------Menu-------------");
			System.out.println("1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. View All");
			System.out.println("4. Update");
			System.out.println("5. Find by ID");
			System.out.println("6. Find by Name");
			System.out.println("7. Exit");
			System.out.println("------------------------------");
			System.out.print("Enter your choice: ");
			ch = sc.nextInt();
			return ch;
		}
		
		public static Employee insert() {
			
			System.out.println("Enter the Employee ID, First Name, Last Name, Email, Salary");
			return (new Employee(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextFloat()));
				
		}
		
		public static Employee update() {
			
			System.out.println("Enter the Employee ID, First Name, Last Name, Email, Salary");
			return (new Employee(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextFloat()));
				
		}
		public static void main(String[] args) throws Exception {
			LMSDAO dao = new LMSDAO();
			String ch;

			do {
			switch (menu()) {
			case 1: {
				Employee e = insert();
				int n = dao.doInsert(e);
				if(n>0) {
					System.out.println("Record Inserted Successfully");
				}
				else {
					System.out.println("Record Found");
				}
				break;
			}
			case 2: {
				
				System.out.println("Enter Employee Id to delete");
				int del = sc.nextInt();
				int n = dao.doDelete(del);
				if(n>0) {
					System.out.println("Record has been deleted");
				}
				else {
					System.out.println("Record Deletion Failure");
				}
				break;
			}
			case 3: {
				int n = dao.viewAll();
				if(n <= 0) {
					System.out.println("No Records Found !!!");
				}
				break;
			}
			case 4: {
				Employee e1 = update();
				int up = dao.doUpdate(e1);
				if(up>0) {
					System.out.println("Record has been updated");
				}
				else {
					System.out.println("Record Updation Failure");
				}
				break;
			}
			case 5: {
				System.out.println("Enter Employee Id to Search.......");
				int fin = sc.nextInt();
				int n = dao.doFind(fin);
				if(n>0) {
					System.out.println("Record Found");
				}
				else {
					System.out.println("Record Not Found");
				}
				
			}
			case 6: {
				System.out.println("Enter Employee First Name to Search.......");
				String fin = sc.next();
				String n = dao.doFindFname(fin);
				if(n == "") {
					System.out.println("Record Found");
				}
				else {
					System.out.println("Record Not Found");
				}
				break;
			}
			case 7: {
				System.out.println("Thank You !!!");
				System.exit(0);
				break;
			}
			default:
				System.out.println("Enter valid Choice...");
			}
			System.out.println("Do you want to continue ( yes | no )");
			ch = sc.next();
			
			}while(ch.equalsIgnoreCase("yes")) ;
				
	}

	}
