package com.practiseproblem;

import java.util.ArrayList;
import java.util.Scanner;

class StudentTeacher {
	String student;
	String teacher;

	public StudentTeacher(String student, String teacher) {
		super();
		this.student = student;
		this.teacher = teacher;
	}
}

class AddRemove {

	ArrayList<StudentTeacher> list = new ArrayList<>();

	void add(StudentTeacher s) {
		list.add(s);
	}

	void remove(String s) {
		for (StudentTeacher i : list) {
			if (i.student.equals(s)) {
				list.remove(i);

				System.out.println("Removed successfully");
				return;
			}
		}
		System.out.println("Data not found");
	}
	void display() {
		for(StudentTeacher i : list) {
			System.out.println(i.student);
			System.out.println(i.teacher);
			
			System.out.println("----------------------------------------------");
		}
	}
}

public class StudentAndTeacher {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		StudentTeacher s1 = new StudentTeacher("subash","tamil");
		StudentTeacher s2 = new StudentTeacher("srienath","english");
		StudentTeacher s3 = new StudentTeacher("giri","hindi");
		StudentTeacher s4 = new StudentTeacher("shakeel","science");
		StudentTeacher s5 = new StudentTeacher("madhan","socials");
		
		
		AddRemove obj = new AddRemove();
		obj.add(s1);
		obj.add(s2);
		obj.add(s3);
		obj.add(s4);
		obj.add(s5);
		
		obj.display();
		
		System.out.println("Enter the student to remove : ");
		String s = sc.next();
		obj.remove(s);
		
		obj.display();
	}

}
