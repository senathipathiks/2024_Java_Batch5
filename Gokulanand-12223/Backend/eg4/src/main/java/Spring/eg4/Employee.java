package Spring.eg4;
import java.util.*;

public class Employee 
{
	int empid;
	String empname;
	ArrayList<String> address;
	
	public Employee() 
	{
		super();
	}

	public Employee(int empid, String empname, ArrayList<String> address) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.address = address;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	
	public ArrayList<String> getAddress() {
		return address;
	}

	public void setAddress(ArrayList<String> address) {
		this.address = address;
	}

	public void display()
	{
		System.out.println("Emp Id : " + empid);
		System.out.println("Emp Name : " + empname);
		System.out.print("Address : ");
		for(String e : address)
		{
			System.out.print(e);
		}
	}
}
