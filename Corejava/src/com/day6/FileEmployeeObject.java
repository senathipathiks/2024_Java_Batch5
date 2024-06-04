package com.day6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int num;
	String name;
	public Employee(int num,String name) {
		this.num = num;
		this.name = name;
	}
	public String toString() {
		return "Employee Name : "+ name + " number :" + num;
	}
}

public class FileEmployeeObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		// TODO Auto-generated method stub
		Employee e1 = new Employee(12,"Gana");
		FileOutputStream fout = new FileOutputStream("D:\\Sample.txt");
		ObjectOutputStream obj1 = new ObjectOutputStream(fout);
		obj1.writeObject(e1);
		
		FileInputStream fin = new FileInputStream("D:\\Sample.txt");
		ObjectInputStream obj2 = new ObjectInputStream(fin);
		Employee e2 = (Employee)obj2.readObject();
		
		System.out.println(e2);

	}

}

