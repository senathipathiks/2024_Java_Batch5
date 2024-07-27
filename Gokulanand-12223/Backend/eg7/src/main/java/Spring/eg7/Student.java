package Spring.eg7;
import java.util.*;

import org.springframework.beans.factory.annotation.*;

public class Student 
{
	int id;
	String name;
	
	@Autowired
	private Address address;
	
	public Student() 
	{
		super();
	}

	public Student(int id, String name, Address address) {
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("Student Id : " + id);
		System.out.println("Student Name : " + name);
		System.out.println("Student Address : ");		
		System.out.print(address);
		
 
	}
	
	
	 
	
	
}
