package day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	
	int no;
	String name;
	
	public Employee(int no, String name) {

		this.no=no;
		this.name=name;
	}
	
	public String toString() {
		return " Employee Name: "+ name+", Employee Roll Number: "+no;
		
	}
}



public class Ex1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
//		
//		FileInputStream fin = new FileInputStream("D:\\Sampletxt.txt");
//		FileOutputStream fout = new FileOutputStream("D:\\Sampletxt1.txt");
//		
//		FileInputStream fvdo = new FileInputStream("D:\\vdo.mp4");
//		FileOutputStream fvdos = new FileOutputStream("D:\\vdo1.mp4");
//
//
//		int chv;
//		while((chv = fvdo.read()) != -1) 
//		{
////			System.out.println((char)chv);
//			 fvdos.write((char)chv);
//		}
//
//		int ch;
//		while((ch = fin.read()) != -1) 
//		{
////			System.out.println((char)ch);
//			fout.write((char)ch);
//		}
//		
//		
//		System.out.println("Task Completed");
//		fin.close();
//		fout.close();
//		fvdo.close();
//		fvdos.close();
		
		Employee e1 = new Employee(12, "Nandhakumaran");
		FileOutputStream fout = new FileOutputStream("D:\\Sampletxt3.txt");
		ObjectOutputStream obj1 = new ObjectOutputStream(fout);
		obj1.writeObject(e1);
		
		FileInputStream fin = new FileInputStream("D:\\Sampletxt3.txt");
		ObjectInputStream obj2 = new ObjectInputStream(fin);
		Employee e2 = (Employee)obj2.readObject();
		
		System.out.println(e2);
		
		FileReader fr = new FileReader("D:\\Sampletxt.txt");
		FileWriter fw = new FileWriter("D:\\Sampletxt1.txt");
		
		int ch;
		while((ch = fr.read()) != -1) 
		{
			System.out.println((char)ch);
			fw.write((char)ch);
		}
	}

}
