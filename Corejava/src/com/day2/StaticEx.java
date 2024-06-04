package com.day2;

class Static
{
	static int count;

	Static()
	{
		count++;
	}
	void display()
	{
		System.out.println(count);
	}
}
public class StaticEx {

	public static void main(String[] args) {
		Static obj1 = new Static();
		obj1.display();
		Static obj2 = new Static();
		obj2.display();
		
	}

}
