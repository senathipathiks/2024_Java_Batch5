package day3;

import java.util.*;

class Employee5 {
	private int eno;
	private String name;

	public void getdata(int eno, String name) {

		this.eno = eno;
		this.name = name;
	}

	void display() {
		System.out.println("name is :" + name);
		System.out.println("Number is :" + eno);
	}

}

public class getting_many_inputs_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee5 obj1[] = new Employee5[5];
		int no;
		String ename;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			obj1[i] = new Employee5();
			System.out.println("Enter Employee No");
			no = sc.nextInt();
			System.out.println("Enter Employee Name");
			ename = sc.next();
			obj1[i].getdata(no, ename);
			obj1[i].display();

		}

	}

}
