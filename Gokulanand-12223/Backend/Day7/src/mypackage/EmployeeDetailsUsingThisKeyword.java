package mypackage;

class EmpDet
{
	//Instance or Object Variables
	int employeeId;
	String employeeName;
	double employeeSalary;
	
	//Constructor
	EmpDet(int employeeId, String employeeName, double employeeSalary)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		
	}
	
	//Method
	void display()
	{
		System.out.println("Employee ID is : "+employeeId);
		System.out.println("Employee Name is : "+employeeName);
		System.out.println("Employee Salary is : "+employeeSalary);
	}
}
public class EmployeeDetailsUsingThisKeyword
{
	public static void main(String[] args)
	{
		Employee gokul = new Employee(111, "Gokul" ,1000);
		gokul.display();

		Employee anand = new Employee(112, "Anand" ,2000);
		anand.display();
	}

}
