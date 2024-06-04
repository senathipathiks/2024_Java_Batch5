//package com.day6;
//
//class Employee{
//	//Instance or Object Variables
//	int employeeId;
//	String employeeName;
//	double employeeSalary;
//
//	//Constructor
//	Employee(int id, String name, double salary){
//		employeeId = id;
//		employeeName = name;
//		employeeSalary = salary;
//	}
//	
//	//Method
//	void display() {
//		System.out.println("Employee Id : " + employeeId);
//		System.out.println("Employee Name : " + employeeName);
//		System.out.println("Employee Id : " + employeeSalary);
//	}
//}
//public class oopsEx {
//
//	public static void main(String[] args) {
//		//Object Creation and Constructor Calling
//		Employee gopi = new Employee(10, "gopi", 200);
//		gopi.display();
//		
//		Employee Ram = new Employee(11, "Ram", 500);
//		Ram.display();
//		
//
//	}
//
//}

package com.day6;

class Mobile{
	//Instance or Object Variables
	String brandName;
	double price;
	int ram;

	//Constructor
	Mobile(String brandName, double price, int ram){
		this.brandName = brandName;
		this.price = price;
		this.ram = ram;
	}
	
	//Method
	void display() {
		System.out.println("Brand Name : " + brandName );
		System.out.println("Price : " + price );
		System.out.println("Ram : " + ram );
	}
}
public class oopsEx {

	public static void main(String[] args) {
		//Object Creation and Constructor Calling
		Mobile oppo = new Mobile("oppo", 10000, 64);
		oppo.display();
		
		Mobile vivo = new Mobile("vivo", 20000, 64);
		vivo.display();
		

	}

}
