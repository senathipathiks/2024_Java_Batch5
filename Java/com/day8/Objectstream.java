package com.day8;

import java.io.*;

class Employee implements Serializable{
	int rollno;
	String name;
	
	public Employee(int rollno, String name) {
		// TODO Auto-generated constructor stub
		this.rollno = rollno;
		this.name = name;
	} 
	
	@Override
	public String toString() {
		return "Employee Name = "+ name +", Roll No. = "+rollno;
	}
}

public class Objectstream {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e = new Employee(1, "Karthi");
		
		FileOutputStream fout = new FileOutputStream("D:\\Karthi R K\\File2.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		
		objout.writeObject(e);
		
		FileInputStream fin = new FileInputStream("D:\\Karthi R K\\File2.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		
		Employee e1 = (Employee)objin.readObject();
		
		System.out.println(e1);
	}
}
