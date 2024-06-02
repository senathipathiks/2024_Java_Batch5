package com.emp;

import java.util.Scanner;

public class MainClass {

	static public void menu() {
		System.out.println("1. Add EMployee");
		System.out.println("2. Update EMployee");
		System.out.println("3. Delete EMployee");
		System.out.println("4. Find EMployee");
		System.out.println("5. Find All EMployees");
		System.out.println("6. Quit / Exit");

		System.out.println("Enter Your Choice");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		
		String msg = "";
		EmployeeManagement1 empm = new EmployeeManagement1();	
		
		do {
			menu();
			int choice = sc.nextInt();
			switch (choice) {
	
			case 1:
				System.out.println("Enter The employee Id, Name, Salary and Dno");
				Employee emp = new Employee(sc.nextInt(), sc.next(),sc.nextDouble(),sc.nextInt());
				if( empm.addEmployee(emp) )
				{
					System.out.println("Employee Object Added");
				}
				else {
					System.out.println("Employee Object Not Added");	
				}
				break;
	
			case 2:
				System.out.println("Enter The details to update :\n employee Id, Name, Salary and Dno");
				Employee emp1 = new Employee(sc.nextInt(), sc.next(),sc.nextDouble(),sc.nextInt());
				if( empm.updateEmployee(emp1) ) {
					System.out.println("The Employee details is updated");
				}
				else {
					System.out.println("Employee Object Not Added");	
				}
				break;
	
			case 3:
				System.out.println("Enter The Employee ID to Find :");
				int x1 = sc.nextInt();
				if(empm.deleteEmployee(x1) == true) {
					System.out.println("The Employee details removed");
				}
				else {
					System.out.println("The Employee Not Present In Employee Data");
				}
				break;
	
			case 4:
				System.out.println("Enter The Employee ID to Find :");
				int x = sc.nextInt();
				Employee e = empm.findEmployee(x);
				if(e != null) {
					System.out.println("The Employee Id "+e.getEid() +" Present In Employee Data \n");
					
					e.display();
				}
				else {
					System.out.println("The Employee Not Present In Employee Data");
				}
				break;
	
			case 5:
				empm.viewAllEmployee();
				break;
	
			case 6:
				System.exit(0);
				break;

			}
			
			System.out.println("Do you want to continue [ YES / NO ]");
			msg = sc.next();
		}
		while(msg.equalsIgnoreCase("YES"));
		
	}

}
