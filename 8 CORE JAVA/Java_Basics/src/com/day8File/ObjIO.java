package com.day8File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable{
	int num;
	String name;
	public Emp(int num,String name) {
		// TODO Auto-generated constructor stub
		this.num = num;
		this.name = name;
	}
	public String toString() {
		return "Employee Name: "+ name + "\nNumber:  "+num;
	}
}

public class ObjIO {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Emp e1 = new Emp(1,"Gopi");
		FileOutputStream fout = new FileOutputStream("D:\\File IO\\sample.txt");
		ObjectOutputStream obj1 = new ObjectOutputStream(fout);
		obj1.writeObject(e1);
		
		FileInputStream fin = new FileInputStream("D:\\File IO\\sample.txt");
		ObjectInputStream obj2 = new ObjectInputStream(fin);
		Emp e2 = (Emp)obj2.readObject();
		
		System.out.println(e2);
		
	}

}
