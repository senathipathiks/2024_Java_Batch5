package taskClass;
import java.time.LocalDate;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("Roberta Petrus", 50000, LocalDate.parse("2021-04-01"));
	    Employee employee2 = new Employee("Loyd Blair", 70000, LocalDate.parse("2015-04-01"));
	    Employee employee3 = new Employee("Magdalena Artemon", 50000, LocalDate.parse("2011-01-15"));
	    employee1.printEmployeeDetails();
	    System.out.println("Years of Service: " + employee1.getYearsOfService());
	    employee2.printEmployeeDetails();
	    System.out.println("Years of Service: " + employee2.getYearsOfService());
	    employee3.printEmployeeDetails();
	    System.out.println("Years of Service: " + employee3.getYearsOfService());
	}

}
