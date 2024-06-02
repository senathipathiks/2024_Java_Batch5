package com.day7;

class Mobile {
	String brandName;
	double price;
	int ram;
	int storage;
	
	Mobile(String brandName, double price, int ram , int storage){
		this.brandName = brandName;
		this.price = price;
		this.ram = ram;
		this.storage = storage;
	}
	
	void display() {
		System.out.println("Brand Name is	:" + brandName);
		System.out.println("Price is 	:" + price);
		System.out.println("Ram is 		:" + ram);
		System.out.println("Storage is	:" + storage);
		System.out.println();
	}
	void display(int x) {
		System.out.println("Storage is	:" + storage);
		System.out.println("Brand Name is	:" + brandName);
		System.out.println("Price is	:" + price);
		System.out.println("Ram is		:" + ram);
		System.out.println();
	}
}

public class TypesOfMethods {
	int x;
	static int a=19;
	public static void main(String[] args) {
		Mobile oppo  = new Mobile("OPPO", 25000.0, 16, 512);
		oppo.display();
		
		Mobile samsung  = new Mobile("SAMSUNG", 50000.0, 16, 1024);
		samsung.display();
		
		Mobile nothing  = new Mobile("NOTHING", 70000.0, 32, 1024);
		nothing.display(1);
		
		TypesOfMethods p = new TypesOfMethods();
		
		System.out.println(p.x);
		System.out.println(TypesOfMethods.a);
		System.out.println(a);
	}

}
