package com.day1;

import java.util.Scanner;

public class MainClass {
	
	static public void menu() {
		System.out.println("1. Add Employee");
		System.out.println("2. Update Employee");
		System.out.println("3. Delete Employee");
		System.out.println("4. Find Employee");
		System.out.println("5. Findall Employee");
		System.out.println("6. Exit/Quit");
		System.out.println("Enter your choice: ");
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Employee_Management ems = new Employee_Management();
		String msg;
		
		do {
			menu();
			int choice = s.nextInt();
			
			switch (choice){
			
			case 1:
				System.out.println("Enter employee ID, Name, Salary, Dno");
				Employee emp = new Employee(s.nextInt(), s.next(), s.nextDouble(),s.nextInt());
				if(ems.addemployee(emp)) {
					System.out.println("Employee Object Added");
				}
				else {
					System.out.println("Employee Object Not Added");
				}
				break;
				
			case 2:
				System.out.println("Enter the id,name,salary,dno to update: ");
				Employee emp1 = new Employee(s.nextInt(), s.next(), s.nextDouble(),s.nextInt());
				if(ems.updateemployee(emp1)) {
					System.out.println("Updated");
				}
				else {
					System.out.println("Not Updated");
				}
				break;
				
			case 3:
				System.out.println("Enter the Employee Id to delete: ");
				int id1 = s.nextInt();
				if(ems.deleteemployee(id1)) {
					System.out.println("Employee Object Removed");
				}
				else {
					System.out.println("Employee Object Not Removed");
				}
				break;
				
			case 4:
				System.out.println("Enter the Employee Id to find: ");
				int id = s.nextInt();
				Employee e = ems.findemployee(id);
				if(e!=null) {
					e.display();
				}
				else {
					System.out.println("Element not found");
				}
				break;
				
			case 5:
				ems.viewallemployee();
				break;
				
			case 6:
				System.out.println("Process Over");
				System.exit(0);
				break;
				
			}
			
			System.out.println("Do you want to continue [Yes | No]");
			msg = s.next();
			
		} while (msg.equalsIgnoreCase("yes"));
		s.close();
	}

}
