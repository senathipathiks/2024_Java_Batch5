package mypackage2;
import java.util.*;;
public class MainClass
{
	public static void menu()
	{
	System.out.println("1. Add Employee");	
	System.out.println("2. Update Employee");	
	System.out.println("3. Delete Employee");	
	System.out.println("4. Find Employee");	
	System.out.println("5. Find all Employee");	
	System.out.println("6. Quit / Exit ");	
	
	System.out.println("Enter your Choice :");
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String msg = "";
		EmployeeManagement ems = new EmployeeManagement();
		do
		{
		menu();
		
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter Employee Id, Name, Salary and dno");
			Employee emp = new Employee(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
			if(ems.addEmployee(emp))
			{
				System.out.println("Employee Object Added Successfully");
			}
			else
			{
				System.out.println("Employee Object Not Added");
			}
			break;
		case 2:
			System.out.println("Enter Employee Id, Name, Salary and Dept No to update :");
			Employee emp1 = new Employee(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
			if(ems.updateEmployee(emp1)) {
				System.out.println("Details Updated Successfully");}
			else {
				System.out.println("Invalid Employee Id");}
			break;
		case 3:
			System.out.println("Enter the Employee Id to delete :");
			int id1 = sc.nextInt();
			if(ems.deleteEmployee(id1))
				System.out.println("Employee Object is Removed Successfully ");
			else
				System.out.println("Employee Not Found ");
			break;
		case 4:
			System.out.println("Enter the Employee Id to find :");
			int id = sc.nextInt();
			Employee e =ems.findEmployee(id);
			if(e !=null)
				e.display();
			else
				System.out.println("Employee Not Found !");
			break;
		case 5:
			ems.viewAllEmployee();
			break;
		case 6:
			System.exit(0);
			break;
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Do u want to Continue [Yes | No]");
		msg = sc.next();
		
		}while(msg.equalsIgnoreCase("yes"));
		
	}
	
}