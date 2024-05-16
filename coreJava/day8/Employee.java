package com.day8;
import java.io.IOException;
import java.io.*;
import java.util.*;

class Emp implements Serializable
{
	int id;
	String name;
	Emp(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return "Employee [rollno= " + id +",name="+ name + "]";
	}
	
}
public class Employee{
 
	public static void main(String[] args)throws IOException ,ClassNotFoundException{
//		FileInputStream fin = new FileInputStream("D:\\imagesANI.png");
		Emp e1=new Emp(1,"vidhu");
		FileOutputStream fot=new FileOutputStream("D:\\Sample1.txt");
		ObjectOutputStream obj1=new ObjectOutputStream(fot);
		obj1.writeObject(e1);
		
		FileInputStream fin = new FileInputStream("D:\\Sample1.txt");
		ObjectInputStream obj2=new ObjectInputStream(fin);
		Emp e2=(Emp)obj2.readObject();
		
		System.out.println(e1);
		fin.close();
		fot.close();
	}
 
}
 