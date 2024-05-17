package mypackage;
import java.time.LocalDate;
import java.time.Period;

public class Employee 
{
	private String name;
	private String job_title;
	private double salary;
	private LocalDate hire_date;
	
	Employee(String name, String job_title, double salary, LocalDate hire_date)
	{
		this.name = name;
		this.job_title = job_title;
		this.salary = salary;
		this.hire_date = hire_date;
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int CalculateYearsOfService()
	{
		LocalDate currentdate = LocalDate.now();
		Period period = Period.between(hire_date, currentdate);
		return period.getYears();
	}
	
	public double RaiseSalary(double percentage)
	{
		salary += salary * (percentage/100);
		return salary;
	}
	
	public void printEmployeeDetails()
	{
		System.out.println("Name : " + name);
		System.out.println("Job title : " + job_title);
		System.out.println("Salary : " + salary);
		System.out.println("Hire Date : " + hire_date);
		System.out.println("Years Of Service : " + CalculateYearsOfService());
	}

	public static void main(String[] args) 
	{
		LocalDate hire_date = LocalDate.of(2024, 05, 8);
		Employee emp = new Employee("Gokul Anand", "Softwate Engineer", 30000, hire_date);
		emp.printEmployeeDetails();
		
		System.out.println("-----------------------------------");
		
		emp.RaiseSalary(10);
		System.out.println("After Raising the salary, it is : ");
		emp.printEmployeeDetails();
		
	}

}
