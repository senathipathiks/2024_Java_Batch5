package mypackage;
import java.util.*;

class School2
{
	int n1,n2,n3;
	LinkedList<String> students = new LinkedList<>();
	LinkedList<String> teachers = new LinkedList<>();
	LinkedList<String> classes = new LinkedList<>();

	void add()
	{
		String studentname, teachername, classesname;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many students to be added :");
		n1 = sc.nextInt();
		for(int i=0; i<n1 ;i++)
		{
		System.out.println("Enter the student name : ");
		studentname = sc.next();
		students.add(studentname);
		}
		
		System.out.println("Enter how many teachers to be added :");
		n2 = sc.nextInt();
		for(int i=0; i<n2 ;i++)
		{
		System.out.println("Enter the teacher name : ");
		teachername = sc.next();
		teachers.add(teachername);
		}
		System.out.println("Enter how many classes to be added :");
		n3 = sc.nextInt();
		for(int i=0; i<n3 ;i++)
		{
		System.out.println("Enter the classes : ");
		classesname = sc.next();
		classes.add(classesname);
		}
	}
	void display()
	{
		for(int i=0; i<n1; i++)
		{
		System.out.println("Student name is : "+students.get(i));
		}
		for(int i=0; i<n2;i++)
		{
		System.out.println("Teacher name is : "+teachers.get(i));
		}
		for(int i=0; i<n3; i++)
		{
		System.out.println("Class is : "+classes.get(i));
		}
		System.out.println("----------------------------");
	}
	
	void remove()
	{
		String student, teacher;
		System.out.println("Enter the student to be removed : ");
		Scanner sc = new Scanner(System.in);
		student = sc.next();
		students.remove(student);
		System.out.println("Student removed Successfully !!!");
		
		System.out.println("Enter the teacher to be removed : ");
		teacher = sc.next();
		teachers.remove(teacher);
		System.out.println("Teacher removed Successfully !!!");
		
			System.out.println("Balance Students are : ");
		for(int i=0; i<n1-1; i++)
		{
			System.out.println(students.get(i));
		}
			System.out.println("Balance Teachers are : ");
		for(int i=0; i<n2-1; i++)
		{
			System.out.println(teachers.get(i));
		}
		System.out.println("Classes are : ");
		for(int i=0 ; i<n3;i++)
		{
			System.out.println(classes);
		}
	}
}
 class DisplaySchoolDetails2 
{
	public static void main(String[] args)
	{
		School2 obj = new School2();
		obj.add();
		obj.display();
		obj.remove();
	}
}
