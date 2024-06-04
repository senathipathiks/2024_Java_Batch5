package com.day8;

import java.util.Scanner;

public class MainClass {
	static public void menu() {
		System.out.println("1.Add Employee");
		System.out.println("2.Update Employee");
		System.out.println("3.Delete Employee");
		System.out.println("4.Find Employee");
		System.out.println("5.FindAll Employee");
		System.out.println("6. Quit / Exit");
		
		System.out.println("Enter Your Choice : ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = "";
		EmployeeManagement ems = new EmployeeManagement();
		
		

		do {
			menu();
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			System.out.println("Enter Employee id,name,salary and dno");
			JavaBean emp = new JavaBean(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextInt());
			if(ems.addJavaBean(emp)) {
				System.out.println("Employee object Added");
			}
			else {
				System.out.println("Employee object not Added");
			}
			break;
		case 2 :
			System.out.println("Enter Employee id,name,salary and dno to update");
			JavaBean emp1 = new JavaBean(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextInt());
			if(ems.updateJavaBean(emp1))
				System.out.println("Employee object updated");
			else
				System.out.println("Employee object not updated");
			break;
		case 3 :
			System.out.println("Enter the employee id to delete");
			int id1 = sc.nextInt();
			if(ems.deleteJavaBean(id1))
				System.out.println("Employee Object Removed");
			else
				System.out.println("Employee not found");
			break;
		case 4 :
			System.out.println("Enter the employee id to find");
			int id = sc.nextInt();
			JavaBean e = ems.findJavaBean(id);
			if(e != null)
				e.display();
			else
				System.out.println("Employe not found");
			break;
		case 5 :
			break;
		case 6 :
			System.exit(0);
			break;
		}
		
		System.out.println("Do you want to continue [Yes | No]");
		msg = sc.next();

		}while(msg.equalsIgnoreCase("yes"));
	}
}
