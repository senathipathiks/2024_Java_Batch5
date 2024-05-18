package Class;

class Employee2
{
	//Instance variables
	int eno;
	String name;
	static int count;
	Employee2(int eno,String name)
	{
		this.eno=eno;
		this.name=name;
	}
}

public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 obj1 = new Employee2(12209,"Madhan");
		System.out.println(obj1.eno);
		System.out.println(obj1.name);


	}

}
