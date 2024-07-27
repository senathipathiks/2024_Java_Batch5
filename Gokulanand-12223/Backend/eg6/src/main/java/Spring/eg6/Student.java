package Spring.eg6;

import java.util.*;

public class Student 
{
	int rollno;
	String name;
	String standard;
	ArrayList<Subject> Subject;
	
	public Student() 
	{
		super();
	}

	public Student(int rollno, String name, String standard, ArrayList<Subject> Subject) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.standard = standard;
		this.Subject = Subject;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public ArrayList<Subject> getSubject() {
		return Subject;
	}

	public void setSubject(ArrayList<Subject> subject) {
		Subject = subject;
	}

	public void display()
	{
		System.out.println("Roll No : " + rollno);
		System.out.println("Name : " + name);
		System.out.println("Standard : " + standard);
		System.out.println("Subject : ");
		for(Subject i : Subject)
		{
			System.out.println(i + " ");
		}
		System.out.println("---------------------------------------------------------------------------------");
		
	}
	
	
}
