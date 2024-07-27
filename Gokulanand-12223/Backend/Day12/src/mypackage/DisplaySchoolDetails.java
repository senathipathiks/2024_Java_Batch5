package mypackage;
import java.util.*;
class School
{
	int s,t,c;
	void noOfStudents()
	{
		System.out.println("Total No. of Students is : "+s);
	}
	void noOfTeachers()
	{
		System.out.println("Total No. of Teachers is : "+t);
	}
	void noOfClasses()
	{
		System.out.println("Total No. of Classes is : "+c);
	}
	void getdata()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no. of students : ");
		s = sc.nextInt();
		System.out.println("Enter the total no. of teachers :");
		t = sc.nextInt();
		System.out.println("Enter the total no. of classes :");
		c = sc.nextInt();
	}
}

public class DisplaySchoolDetails
{
	public static void main(String[] args) 
	{
		
		School obj = new School();
		obj.getdata();
		obj.noOfStudents();
		obj.noOfTeachers();
		obj.noOfClasses();
	}

}
