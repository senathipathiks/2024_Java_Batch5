package com.lms.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.lms.bean.Employee;
import com.lms.dao.LMSDAO;

public class LMSMain {

	static Scanner sc = new Scanner(System.in);

	public static int displayMenu() {
		int choice;
		System.out.println("----------------MENU----------------");
		System.out.println("1.Insert ");
		System.out.println("2.Delete ");
		System.out.println("3.ViewAll ");
		System.out.println("4.Update ");
		System.out.println("5.Find ");
		System.out.println("6.Exit ");
		System.out.println("-------------------------------------");
		choice = sc.nextInt();
		return choice;

	}

	public static Employee insert() {
		System.out.println("Enter the Employee Id, Name, Designation, Department ");
		return (new Employee(sc.nextInt(), sc.next(), sc.next(), sc.next()));
	}

	public static Employee update() {
		System.out.println("Enter the Employee Id, Name, Designation, Department for update ");
		return (new Employee(sc.nextInt(), sc.next(), sc.next(), sc.next()));
	}

	public static void main(String[] args) throws SQLException {
		LMSDAO dao = new LMSDAO();
		String ch;
		int id;
		int m;
		do {
			switch (displayMenu()) {
			case 1:
				Employee e = insert();
				int n = dao.doInsert(e);
				if (n > 0) {
					System.out.println("Record Inserted Successfully");
				} else {
					System.out.println("Record Insertion Failed");
				}
				break;
			case 2:
				System.out.println("Enter the employee id to be deleted");
				id = sc.nextInt();
				n = dao.doDelete(id);
				if (n > 0) {
					System.out.println("Record deleted successfully");
				} else {
					System.out.println("Record Not found");
				}
				break;
			case 3:
				int t = dao.viewAll();
				if (t <= 0) {
					System.out.println("No Records Found");
				}
				break;
			case 4:
				Employee e1 = update();
				int n2 = dao.doUpdate(e1);
				if (n2 > 0) {
					System.out.println("Updated successfully");
				} else {
					System.out.println("Not updated");
				}
				break;
			case 5:
				System.out.println("Enter the id to be searched");
				id = sc.nextInt();
				m = dao.doFind(id);
				if (m > 0) {
					System.out.println("Founded");
				} else {
					System.out.println("Not founded");
				}

				break;
			default:
				System.exit(0);
			}
			System.out.println("Do you wish to continue: (Yes/No)");
			ch = sc.next();
		} while (ch.equalsIgnoreCase("yes"));
		System.out.println("The application was closed");

	}

}
