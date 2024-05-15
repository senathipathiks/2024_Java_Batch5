package day8_StreamsJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.*;

class Employee implements Serializable{
	 int rno;
	 String name;
	 
	 public Employee(int rno,String name) {
		 this.rno=rno;
		 this.name=name;
	 }
	 @Override
	 public String toString() {
		 return "Employee Name = "+name +" Roll no = "+rno;
		 
	 }
	
	
}



public class Objstream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
          Employee e = new Employee(1, "Aravindh");
          FileOutputStream fout = new FileOutputStream("D:\\FileDemo.txt");
          ObjectOutputStream obj1= new ObjectOutputStream(fout);
          obj1.writeObject(e);
          
          FileInputStream fin = new FileInputStream("D:\\Filedemo.txt");
          ObjectInputStream objin = new ObjectInputStream(fin);
          
          Employee e1=(Employee)objin.readObject();
          System.out.println(e1);
          
          
          
          
	}

}


