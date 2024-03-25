package com;

import java.util.Scanner;

public class MainClass {
	public static void menu() {
		System.out.println("1. Add Doctor");
		System.out.println("2. Update Doctor");
		System.out.println("3. Delete Doctor");
		System.out.println("4. Find Doctor");
		System.out.println("5. View All Doctors");
		System.out.println("6. Exit");
		System.out.println("---------------------------");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String msg = "";
		
		DoctorManagement dm = new DoctorManagement();
		do {
			menu();
			System.out.println("Enter you Choice");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("--------------  Enter Doctor details  -------------- ");
				System.out.println("Enter Doctor ID, First Name, Last Name, email, mobile number  : ");
				
				if(dm.addDoctor(sc.nextInt(), sc.next(), sc.next(), sc.next(),sc.nextLong())){
					System.out.println("Doctor Object Added Successfully");
				} else {
					System.out.println("Doctor Object Not Added");
				}
				break;
			case 2:
				System.out.println("--------------  Enter Updated Doctor details  -------------- ");
				System.out.println("Enter Doctor ID, First Name, Last Name, email, mobile number  : ");
				
				if(dm.addDoctor(sc.nextInt(), sc.next(), sc.next(), sc.next(),sc.nextLong())){
					System.out.println("Doctor Object updated Successfully");
				} else {
					System.out.println("Doctor Object Not updated");
				}
				break;
			case 3:
				System.out.println("Enter the Doctor ID to Delete : ");
				int delId = sc.nextInt();
				if(dm.deleteDoctor(delId)) {
					System.out.println("Doctor Record Deleted.");
				} else {
					System.out.println("Doctor Record Not Found.");
				}
				break;
			case 4:
				System.out.println("Enter the Doctor ID to find : ");
				int findId = sc.nextInt();
				Doctor d = dm.findDoctor(findId);
				if(d != null ) {
					System.out.println("----- Doctor Details -----");
					d.display();
				} else {
					System.out.println("Doctor Not Found!!");
				}
				break;
			case 5:
				System.out.println("----- Doctors Details -----");
				dm.viewAllDoctor();
				break;
				
			}
			System.out.println("Do you want to continue [Yes | No] ");
			msg = sc.next();
		}while(msg.equalsIgnoreCase("yes"));
		sc.close();
		

	}

}
