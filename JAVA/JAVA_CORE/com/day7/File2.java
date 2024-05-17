package com.day7;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Employee implements Serializable
{
	int id;
	String name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return "Employee [rollno= " + id +",name="+ name + "]"; 
	}
	
}
public class File2 {

	public static void main(String[] args)throws IOException ,ClassNotFoundException{
//		FileInputStream fin = new FileInputStream("D:\\imagesANI.png");
		Employee e1=new Employee(1,"Ani");
		FileOutputStream fot=new FileOutputStream("D:\\Sample1.txt");
		ObjectOutputStream obj1=new ObjectOutputStream(fot);
		obj1.writeObject(e1);
		
		FileInputStream fin = new FileInputStream("D:\\Sample1.txt");
		ObjectInputStream obj2=new ObjectInputStream(fin);
		Employee e2=(Employee)obj2.readObject();
		
		System.out.println("Task completed");
		System.out.println(e1);
		fin.close();
		fot.close();
	}

}
