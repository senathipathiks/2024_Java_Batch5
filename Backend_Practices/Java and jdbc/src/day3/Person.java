package day3;

public class Person 
{

	String name;
	int age;
	
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	void display()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
	public static void main(String[] args) 
	{
		Person obj = new Person ("Gokul Anand ", 20);
		obj.display();
		
	}
}

