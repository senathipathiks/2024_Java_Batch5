package mypackage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int rno;
	String name;
	
	Employee (int rno, String name)
	{
		this.rno = rno;
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Employee [Roll No : " + rno + " ; Name : " + name + "]";
	}
}

public class FileDemo5 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Employee e1 = new Employee(1, "Gokul Anand");
		FileOutputStream file1 = new FileOutputStream("E:\\new.txt");
		ObjectOutputStream obj1 = new ObjectOutputStream(file1);
		obj1.writeObject(e1);
		
		FileInputStream file2 = new FileInputStream("E:\\new.txt");
		ObjectInputStream obj2 = new ObjectInputStream(file2);
		Employee e2 = (Employee)obj2.readObject();
		
		System.out.println(e2);
		}
}

