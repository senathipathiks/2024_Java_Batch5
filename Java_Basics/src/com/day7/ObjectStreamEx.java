package com.day7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int rno;
	String name;
	Employee(int r, String n){
		rno = r;
		name= n;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee [Roll.No = "+rno+", Name= "+name+"]";
	}
	
}
public class ObjectStreamEx {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		Employee e1 = new Employee(28,"Nagarjun");
		FileOutputStream fout = new FileOutputStream("D://L1/Java_Basics/src/com/day7/DS Call.txt");
		ObjectOutputStream obj1 = new ObjectOutputStream(fout);
		obj1.writeObject(e1);
		
		FileInputStream fin = new FileInputStream("D://L1/Java_Basics/src/com/day7/DS Call.txt"); 
		ObjectInputStream obj2 = new ObjectInputStream(fin);
		Employee e2 = (Employee) obj2.readObject();
		
		System.out.println(e2);
	}

}
