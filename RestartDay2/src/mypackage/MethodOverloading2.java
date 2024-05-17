package mypackage;

public class MethodOverloading2
{
	int rollno;
	String name;
	
	MethodOverloading2()
	{
		rollno = 0;
		name = "";
	}
	MethodOverloading2(int r)
	{
		rollno = r;
		name = "Relevantz";
	}
	MethodOverloading2(int r, String s)
	{
		rollno = r;
		name = s;
	}

	public static void main(String[] args) 
	{
		MethodOverloading2 obj1 = new MethodOverloading2();
		MethodOverloading2 obj2 = new MethodOverloading2(2);
		MethodOverloading2 obj3 = new MethodOverloading2(3, "Arun");
	}

}
