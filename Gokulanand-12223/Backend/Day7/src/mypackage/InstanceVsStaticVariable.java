package mypackage;

//Check individually the output to find the difference b/w Instance and static varibale.

public class InstanceVsStaticVariable 
{
/*	int a = 10;

	public static void main(String[] args)
	{
		InstanceVsStaticVariable obj1 = new InstanceVsStaticVariable();
		InstanceVsStaticVariable obj2 = new InstanceVsStaticVariable();
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a = 20;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
			
	}
*/
	static int a = 10;

	public static void main(String[] args)
	{
		InstanceVsStaticVariable obj1 = new InstanceVsStaticVariable();
		InstanceVsStaticVariable obj2 = new InstanceVsStaticVariable();
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a = 20;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
	}
}
