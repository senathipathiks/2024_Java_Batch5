package com.day7;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//class Employee implements Serializable{
//	int rollno;
//	String name;
//	Employee(int r, String n){
//		rollno=r;
//		name=n;
//	}
//	public String toString() {
//		return "Employee [rollno=" + rollno +",name=" + name + "]";
//		}
//}
public class IOStreams {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
//		char c='a';
//		//c=(char)System.in.read();
//		int n;
//		n=System.in.read();
//		System.out.println(c);
//		System.out.println(n);
//		System.err.println("There is an error");
		
//		FileInputStream fin = new FileInputStream("C:\\Users\\vigneswaran.rajesh\\Documents\\Main.txt");
//		FileOutputStream fout = new FileOutputStream("C:\\Users\\vigneswaran.rajesh\\Documents\\Main1.txt");
//		int ch;
//		while((ch=fin.read())!=-1) {
//			System.out.println((char)ch);
//			fout.write((char)ch);
//		}
//		System.out.println("Task Completed");
//		fin.close();
//		fout.close();
		
//		Employee e1 = new Employee(6,"vicky");
//		FileOutputStream fot=new FileOutputStream("D:\\\\Sample1.txt");
//		ObjectOutputStream obj1=new ObjectOutputStream(fot);
//		obj1.writeObject(e1);
//		
//		FileInputStream fin = new FileInputStream("D:\\Sample1.txt");
//		ObjectInputStream obj2=new ObjectInputStream(fin);
//		Employee e2=(Employee)obj2.readObject();
//		
//		System.out.println(e2);
		
		FileReader fin = new FileReader("D:\\Sample1.txt");
		FileWriter fout = new FileWriter("D:\\Sample2.txt");
		int ch;
		while((ch=fin.read())!=-1) {
			System.out.print((char)ch);
			fout.write((char)ch);
		}
		System.out.println("Task Completed");
		fin.close();
		fout.close();
	}

}
