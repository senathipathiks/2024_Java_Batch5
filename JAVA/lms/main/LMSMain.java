package com.lms.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.lms.bean.Employee;
import com.lms.dao.LMSDAO;

public class LMSMain {
	static Scanner sc = new Scanner(System.in);

	public static int displayMenu() {
		int choice;
		System.out.println("-----------------MENU----------------------");
		System.out.println("1.Insert");
		System.out.println("2.Delete");
		System.out.println("3.ViewAll");
		System.out.println("4.Update");
		System.out.println("5.Find");
		System.out.println("6.Find by name");
		System.out.println("-------------------------------------------");
		choice = sc.nextInt();
		return choice;
	}

	public static Employee insert() {
		System.out.println("mn Enter the EMp ID,Name,Designation and dept");
		return (new Employee(sc.nextInt(), sc.next(), sc.next(), sc.next()));
	}
	public static Employee update() {
		System.out.println("Enter the EMp ID,Name,Designation and dept for update");
		return (new Employee(sc.nextInt(), sc.next(), sc.next(), sc.next()));
	}

	public static void main(String args[]) throws SQLException {
		LMSDAO dao = new LMSDAO();
		String ch,name;
		int n,id;
		
		do
		{
			
			switch (displayMenu()) {
			case 1:
				Employee e = insert();
				n = dao.doInsert(e);
				if (n > 0) {
					System.out.println("Record Inserted Successfully");
				} else {
					System.out.println("Record Insertion Failure");
				}
				break;
			case 2:
				System.out.println("Enter the ID to be deleted");
				id=sc.nextInt();
				n=dao.doDelete(id);
				if (n > 0) {
					System.out.println("Record Deleted Successfully");
				} else {
					System.out.println("Record Deleted Failure");
				}
				break;
			case 3:
				n = dao.viewAll();
				if (n <= 0) {
					System.out.println("No records Found");
				}
				break;
			case 4:
				Employee e1 = update();
				n = dao.doUpdate(e1);
				if (n > 0) {
					System.out.println("Record Updated Successfully");
				} else {
					System.out.println("Record Updated Failure");
				}
				break;
			case 5:
				System.out.println("Enter the ID to find");
				id=sc.nextInt();
				n=dao.doFind(id);
				if (n > 0) {
					System.out.println("Record found Successfully");
				} else {
					System.out.println("Record not found");
				}
				break;
			case 6:
				System.out.println("Enter the name to find");
				name=sc.next();
				n=dao.doFindEmp(name);
				if (n > 0) {
					System.out.println("Record found Successfully");
				} else {
					System.out.println("Record not found");
				}
				break;
				
	
			}
			System.out.println("Do you wish to continue:(yes/no)");
			ch=sc.next();
		}while(ch.equalsIgnoreCase("yes"));
	}

}
