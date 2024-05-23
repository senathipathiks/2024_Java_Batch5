package employeeManSys;

import java.util.Scanner;

public class MainClass {
	
	static public void menu() {
		System.out.println("1. Add Employee");
		System.out.println("2. update Employee");
		System.out.println("3. delete Employee");
		System.out.println("4. find Employee");
		System.out.println("5. find all Employee");
		System.out.println("6. quit/Exit Employee");
		
		System.out.println("Enter you choice:");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String msg = " ";
		EmpManSys1 ems = new EmpManSys1();
		do {
		menu();
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter employeeid, name, salary and dno");
			employee emp = new employee(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
			if (ems.addemployee(emp)) {
				System.out.println("Employee object Added");
			}
			else {
				System.out.println("Employee object Not Added");

			}
			break;
			
		case 2:
			System.out.println("Enter employeeid, name, salary and dno to update");
			employee emp1 = new employee(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
			if(ems.updateemployee(emp1))
				System.out.println("Employee object updated");
			else
				System.out.println("Employee object not found");

			break;
			
		case 3:
			System.out.println("Enter the employee id to delete:");
			int id1 = sc.nextInt();
			ems.deleteemployee(id1);
			break;
			
		case 4:
			System.out.println("Enter the employee id to find");
			int id = sc.nextInt();
			employee e = ems.findemployee(id);
			if(e!=null)
				e.display();
			else
				System.out.println("Employee not found");
			break;
		case 5:
			ems.viewAllemployee();
			break;
		case 6:
			System.exit(0);
			break;
		}
		
		System.out.println("Do you want to continue [yes/ no]");
		msg = sc.next();
		
		}while(msg.equalsIgnoreCase("Yes"));
		
	}

}
