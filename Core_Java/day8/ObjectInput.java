package com.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int rollno;
	String name;
	Employee(int r, String s){
		rollno = r;
		name = s;
	}
	public String toString() {
		return "Employee[rollno = " + rollno +" , name= "+ name +"]";
	}
}
public class ObjectInput {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e = new Employee(12219,"Aravind");
		FileOutputStream fout = new FileOutputStream("D://Employee.txt");
		ObjectOutputStream obj1 = new ObjectOutputStream(fout);
		obj1.writeObject(e);
		
		FileInputStream fin = new FileInputStream("D://Employee.txt");
		ObjectInputStream obj2 = new ObjectInputStream(fin);
		Employee e2 = (Employee) obj2.readObject(); //we need to type cast because it return the object class instances.
		
		System.out.println(e2);
		
		fin.close();
		fout.close();
	}

}
