package com.parlor.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.parlor.bean.Parlor;
import com.parlor.dao.ParlorDAO;



public class ParlorMain {

	static Scanner sc = new Scanner(System.in);
	public static int displayMenu() {
		int choice;
		
		System.out.println("------MENU-------");
		System.out.println("1. Insert User");
		System.out.println("2. Delete User");
		System.out.println("3. View All Users");
		System.out.println("4. Update User");
		System.out.println("5. Find an User By Id");
		System.out.println("6. Find an User By Name");
		System.out.println("7. Exit");
		choice = sc.nextInt();
		return choice;
	}
	
	public static Parlor insert() {
		System.out.println("Enter the User ID, Name, age, phone number and Address for Intertion");
		return (new Parlor(sc.nextInt(),sc.next(),sc.nextInt(),sc.next(),sc.next()));
	}
	
	public static Parlor update() {
		System.out.println("Enter the User ID, Name, age, phone number and Address for Updation");
		return (new Parlor(sc.nextInt(),sc.next(),sc.nextInt(),sc.next(),sc.next()));
	}
	
	
	public static void main(String args[]) throws SQLException {
		ParlorDAO dao = new ParlorDAO();
		String ch;
		int n;
		int id;
		String name;
		do{
		switch(displayMenu()) {
		case 1:
			Parlor u = insert();
			n = dao.doInsert(u);
			if(n>0) {
				System.out.println("Record Inserted Successfully");
			}
			else {
				System.out.println("Record Insertion Failure");
			}
			break;
		case 2:
			System.out.println("Enter the User ID to delete");
			id = sc.nextInt();
			n = dao.doDelete(id);
			if(n>0) {
				System.out.println("Record Deleted Successfully");
			}
			else {
				System.out.println("Record Deletion Failure");
			}
			break;
		case 3:
			n = dao.viewAll();
			if(n<=0) {
				System.out.println("No Records Found ");
			}
			break;
		case 4:
			Parlor e1 =update();
			n = dao.doUpdate(e1);
			if(n>0) {
				System.out.println("Record Updated Successfully");
			}
			else {
				System.out.println("Record Updation Failure");
			}
			break;
		case 5:
			System.out.println("Enter the User ID to Find");
			id = sc.nextInt();
			n = dao.doFindByID(id);
			if(n>0) {
				System.out.println("Record Found Successfully");
			}
			else {
				System.out.println("No Record Found");
			}
			break;
			
		case 6:
			System.out.println("Enter the User Name to Find");
			name = sc.next();
			n = dao.doFindByName(name);
			if(n>0) {
				System.out.println("Record Found Successfully");
			}
			else {
				System.out.println("No Record Found");
			}
			break;
		}
		System.out.println("Do  you want to continue (YES/NO)");
		ch = sc.next();
		}while(ch.equalsIgnoreCase("yes"));
	}
}
