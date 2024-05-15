package day2;

import java.util.Scanner;

public class Pin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter First Name: ");
    	String firstName = sc.next();
    	System.out.println("Enter Last Name: ");
    	String lastName = sc.next();
    	System.out.println("Enter Aadhar Number: ");
    	String aadharNumber = sc.next();
    	System.out.println("Enter PAN Number: ");
    	String panNumber = sc.next();
    	System.out.println("Enter Date of Birth: ");
    	String dobString = sc.next();
        
 
        System.out.println("Generated PIN: " + lastName.substring(lastName.length() - 2).toUpperCase() + firstName.substring(0, 3).toLowerCase() + aadharNumber.substring(4, 8) + panNumber.replaceAll("\\D+","") + dobString.substring(3,6).toUpperCase());
	}

}
