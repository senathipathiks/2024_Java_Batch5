package Class;


class Employee3
{
	//Instance variables
	int eno;
	String name;
	static int count;
	Employee3(int eno,String name)
	{
		this.eno=eno;
		this.name=name;
	}
	static int increment()
	{
		return count++;
	}
	void display()
	{
		System.out.println(eno+ ":" +name);
	}
}
public class Eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee3 obj1 = new Employee3(12209,"Madhan");
		System.out.println(Employee3.increment());
		obj1.display();
		
		Employee3 obj2 = new Employee3(12209,"Madhan");
		System.out.println(Employee3.increment());
		obj2.display();

	}

}
