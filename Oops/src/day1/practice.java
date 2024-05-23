package day1;

class employee {
	// variable
	int employeeID ;
	String employeeName ;
	double employeeSalary ;

//constructor
	employee(int employeeID, String employeeName, double employeeSalary){
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		employeeSalary = employeeSalary;
		
	}
	//methhod

void display() {
	System.out.println("Employee Id" + employeeID);
	System.out.println("Employee Name" + employeeName);
	System.out.println("Employee Salary" + employeeSalary);

}}
public class practice {
	//Instance or object variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee prince = new employee(12231, "Prince", 8000);
		prince.display();
		
		
	}

}
