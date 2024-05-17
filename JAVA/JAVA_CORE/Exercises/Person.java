package Exercises;
import java.util.Scanner;
class Person1
{
	int age;
	String name;
	Person1(int age,String name)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
public class Person {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Person1 p=new Person1(21,"ANI");
		p.display();
		
	}

}
