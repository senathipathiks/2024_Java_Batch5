package mypackage;

class Employee
{
	//Instance or Object Variables
	int employeeId;
	String employeeName;
	double employeeSalary;
	
	//Constructor
	Employee(int id, String name, double salary)
	{
		employeeId = id;
		employeeName = name;
		employeeSalary = salary;
		
	}
	
	//Method
	void display()
	{
		System.out.println("Employee ID is : "+employeeId);
		System.out.println("Employee Name is : "+employeeName);
		System.out.println("Employee Salary is : "+employeeSalary);
	}
}
public class EmployeeDetails
{
	public static void main(String[] args)
	{
		Employee gokul = new Employee(111, "Gokul" ,1000);
		gokul.display();

		Employee anand = new Employee(112, "Anand" ,2000);
		anand.display();
	}

}
