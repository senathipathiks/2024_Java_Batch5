package Spring.eg8;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	@Value("202008")
	int id;
	@Value("Jhanvi Kapoor")
	String name;
	
	@Autowired
	Address address;
	
	public Student() 
	{
		super();
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	
	public void display()
	{
		System.out.println("Student Id : " + id);
		System.out.println("Student Name : " + name);		
		System.out.println("Student Address : " + address);
	}
}
