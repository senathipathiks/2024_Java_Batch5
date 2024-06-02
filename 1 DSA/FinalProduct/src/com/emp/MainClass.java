package com.emp;

import java.util.Scanner;

public class MainClass {

	public static void menu() {
		
		System.out.println(" 1 : Add Product ");
		System.out.println(" 2 : Find Product ");
		System.out.println(" 3 : Update Product ");
		System.out.println(" 4 : Delete Product ");
		System.out.println(" 5 : View All Product ");
		System.out.println(" 6 : Exit ");
		System.out.println("Enter Your Choice: ");
	}
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
		String msg = "";
		ProductManagement pm = new ProductManagement();
		
		do {
			
			menu();
			
			int choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Enter The Product Id, Name, Price, Quantity, Weigth and Type");
				Product p = new Product(sc.nextInt(), sc.next(),sc.nextInt(),sc.next(),sc.nextInt(),sc.next());
				if(pm.addProduct(p) )
				{
					System.out.println("Product Was Added");
				}
				else {
					System.out.println("Product Was Not Added");	
				}
				break;
	
			case 2:
				System.out.println("Enter The Product ID to Find :");
				int x = sc.nextInt();
				Product p1 = pm.findProduct(x);
				if(p1 != null) {
					System.out.println("The Product name "+p1.getProductName() +" Present In Product Data \n");
					
					p1.display();
				}
				else {
					System.out.println("The Product Not Present In Product Data");
				}
				break;
				
			case 3:
				System.out.println("Enter The details to update :\n Product Id, Name, Price, Quantity, Weigth and Type");
				Product p2 = new Product(sc.nextInt(), sc.next(),sc.nextInt(),sc.next(),sc.nextInt(),sc.next());
				if( pm.updateProduct(p2) ) {
					System.out.println("The Product details is updated");
				}
				else {
					System.out.println("Product Not Added");	
				}
				break;
	
			case 4:
				System.out.println("Enter The Product ID to Delete :");
				int id = sc.nextInt();
				if(pm.deleteProduct(id) == true) {
					System.out.println("The Product details removed");
				}
				else {
					System.out.println("The Product Not Present In Product Data");
				}
				break;
	
			case 5:
				pm.viewAll();
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
