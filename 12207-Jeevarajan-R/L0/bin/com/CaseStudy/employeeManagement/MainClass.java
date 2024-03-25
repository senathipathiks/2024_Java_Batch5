package CaseStudy.employeeManagement;

import java.util.Scanner;

public class MainClass {
	
	public static void menu() {
		System.out.println("1. Add Employee");
		System.out.println("2. Update Employee");
		System.out.println("3. Delete Employee");
		System.out.println("4. Find Employee");
		System.out.println("5. View All Employee");
		System.out.println("6. Exit / Quit");
		System.out.println("-------------------------------");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String msg = "";
		EmployeeManagement1 ems = new EmployeeManagement1(); // Hash-map 
		
		
		do {
		menu();
		System.out.println("Enter you Choice");
		int choice = sc.nextInt();
			
		switch(choice) {
		case 1:
			System.out.println("Enter Employee ID, Name, Salary and DeptNo");
			Employee emp = new Employee(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextInt());
			if(ems.addEmp(emp)) {
				System.out.println("Employee Object Added Successfully");
			} else {
				System.out.println("Employee Object Not Added");
			}
			break;
		case 2:
			System.out.println("Enter Employee ID, Name, Salary and DeptNo");
			Employee Updemp = new Employee(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextInt());
			if(ems.updateEmp(Updemp)) {
				System.out.println("Employee Object Updated Successfully");
			} else {
				System.out.println("Employee Object Not Added");
			}
			break;
		case 3:
			System.out.println("Enter the Employee ID to Delete : ");
			int delId = sc.nextInt();
			if(ems.deleteEmp(delId)) {
				System.out.println("Employee Record Deleted.");
			} else {
				System.out.println("Employee Record Not Found.");
			}
			break;
		case 4:
			System.out.println("Enter the Employee ID to find : ");
			int findId = sc.nextInt();
			Employee e = ems.findEmp(findId);
			if(e != null ) {
				e.display();
			} else {
				System.out.println("Employee Not Found!!");
			}
			break;
		case 5:
			ems.viewAllEmp();
			break;
		default:
			break;
		}
		
		System.out.println("Do you need to continue [YES/NO]: ");
		msg = sc.next();
		}while(msg.equalsIgnoreCase("yes"));
		sc.close();
	}

}
