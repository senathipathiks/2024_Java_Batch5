package Class;

import java.util.Scanner;

class Employee5
{
	int rno;
	String ename;
	
	public void getdata (int rno,String ename)
	{
		this.rno = rno;
		this.ename = ename;
		
	}
	
	void display()
	{
		System.out.println("Employee name is: " +ename);
		System.out.println("Employee no is: " +rno);
	}
}

public class Arrayforinputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee5 obj[] = new Employee5[5];
		int rno;
		String ename;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			obj[i] = new Employee5();
			System.out.println("Enter Employee No: ");
			rno = sc.nextInt();
			System.out.println("Enter Employee Name: ");
			ename = sc.next();
			obj[i].getdata(rno,ename);
			obj[i].display();
			}
		

	}

}
