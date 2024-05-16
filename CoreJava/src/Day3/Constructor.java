package Day3;

class Person{
	
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.print("\nName :"+name);
		System.out.print("\nAge :"+age);
	}	
}
public class Constructor {

	public static void main(String[] args) {
		
		Person p=new Person("Velan", 21);
		Person p1=new Person("Vicky",21);
		

	}

}
