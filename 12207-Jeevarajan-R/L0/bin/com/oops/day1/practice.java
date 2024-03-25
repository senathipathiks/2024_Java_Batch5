package oops.day1;

class Employee{
	//Variables
	int employeeId;
	String employeeName;
	double employeeSalary;
	
	//creating constructor
	//constructor should be named as class name
	Employee(int id_, String na, Double sal){
		this.employeeId = id_;
		this.employeeName = na;
		this.employeeSalary = sal;
	}
	
	//Methods
	void display() {
		System.out.println("Employee Id : "+ employeeId);
		System.out.println("Employee Name : "+ employeeName);
		System.out.println("Employee Salary : "+ employeeSalary);
	}
}

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object creation and constructor calling
		Employee Mrj = new Employee(12207,"Jeevarajan",8000.0);
		Mrj.display();
		
		//creating new object for another employee
		Employee gopi = new Employee(12218,"GopiKrishnan",8000.0);
		System.out.println();
		
		//updating the salary using dot(.) operator
		gopi.employeeSalary = 15000.0;
		gopi.display();

	}

}
