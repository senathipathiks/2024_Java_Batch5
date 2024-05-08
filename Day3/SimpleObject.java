package Day3;

import java.util.Scanner;

class Employee
{
	private int rollno;
	private String name;
	
	void getData(int r , String n) {
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println("Rollno: "+rollno);
		System.out.println("Name: "+name);
	}
}

public class SimpleObject {
	
	public static void main(String[] args) {
		Employee obj[]=new Employee[5];
		int rno;
		String ename;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			obj[i]=new Employee();
			System.out.println("Enter Employee No: ");
			rno=sc.nextInt();
			System.out.println("Enter Employee Name: ");
			ename=sc.next();
			obj[i].getData(rno,ename);
			obj[i].display();
		}
	}

}
