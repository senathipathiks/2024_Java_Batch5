package com.day7;

 class Employee {
	//variable
	int empId;
	String empName;
	double empSalary;
	
	//constructor
	Employee(int empId, String empName, double empSalary){
			this.empId = empId;
			this.empName = empName;
			this.empSalary = empSalary;
	}
	
	 void display() {
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Salary : " + empSalary);
		System.out.println();
		
	}
}
 
public class EmployeeInformation {
	
	public static void main(String[] args) {
		Employee emp = new Employee(12,"gk",350000.0);
		emp.display();
		
		Employee pri = new Employee(18,"Prince",400000.0);
		pri.display();
		
		Employee jeeva = new Employee(20,"Jeeva",500000.0);
		jeeva.display();
		
	}
}
