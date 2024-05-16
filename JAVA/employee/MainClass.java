package employee;

import java.util.Scanner;


public class MainClass {
	static public void menu() {
		System.out.println("1 .Add Employee");
		System.out.println("2 .Update Employee");
		System.out.println("3 .Delete Employee");
		System.out.println("4 .Find Employee");
		System.out.println("5 .Find ALL Employee");
		System.out.println("6 .Quit / Exit");

		System.out.println("Enter your choice");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String msg;
		EmployeeManagement ems = new EmployeeManagement();
		do {
			menu();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter employee Id ,name,salary,dno");
				Employee emp = new Employee(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
				if (ems.addEmployee(emp)) {
					System.out.println("Employee object added");
				} else {
					System.out.println("Employee object not added");
				}
				break;
			case 2:
				System.out.println("Enter employee Id ,name,salary,dno");
				Employee emp1 = new Employee(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
				if (ems.UpdateEmployee(emp1)) {
					System.out.println("Employee object updated");
				} else {
					System.out.println("Employee not found");
				}
				break;
			case 3:
				System.out.println("Enter the Employee Id to delete: ");
				int id1 = sc.nextInt();
				if (ems.deleteEmployee(id1)) {
					System.out.println("Employee object removed");
				} else {
					System.out.println("Employee not found");
				}
				break;
			case 4:
				System.out.println("Enter the Employee Id to find : ");
				int id = sc.nextInt();
				Employee e = ems.findEmployee(id);
				if (e != null) {
					e.display();
				} else {
					System.out.println("Employee is not present");
				}
				break;
			case 5:
				ems.viewAllEmployee();
				break;
			case 6:
				System.exit(choice);
				break;
			}
			System.out.println("Do you want to continue [Yes | NO]");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));
	}

}

