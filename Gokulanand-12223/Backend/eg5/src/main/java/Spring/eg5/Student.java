package Spring.eg5;
import java.util.*;

public class Student 
{
	int id;
	String name;
	ArrayList<Address> address;
	
	public Student() 
	{
		super();
	}

	public Student(int id, String name, ArrayList<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Address> getAddress() {
		return address;
	}

	public void setAddress(ArrayList<Address> address) {
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("Student Id : " + id);
		System.out.println("Student Name : " + name);
		System.out.println("Student Address : ");		
		for(Address i  : address ) {
			System.out.print(i + " ");
		}

	}
	
	
	 
	
	
}
