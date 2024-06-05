package Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int rollno;
	String name;

	Employee(int no, String n) {
		rollno = no;
		name = n;
	}

	public String toString() {
		return "Employee[Rollno ="+rollno+" Name = "+name+" ]";
	}
}

public class ObjectStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e1 = new Employee(8,"subash");
		FileOutputStream fout = new FileOutputStream("D:\\ObjectStreamExample.txt");
		ObjectOutputStream obj1 = new ObjectOutputStream(fout);
		obj1.writeObject(e1);
		
		FileInputStream fin = new FileInputStream("D:\\\\ObjectStreamExample.txt");
		ObjectInputStream obj2 = new ObjectInputStream(fin);
		Employee e2 = (Employee)obj2.readObject();
		
		System.out.println(e2);
		
		
		
	}

}
