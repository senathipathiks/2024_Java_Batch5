package com.day3;
import java.util.Arrays;
class A1
{
	A1()
	{
		System.out.println("Class A");
	}
	A1(int x)
	{
		System.out.println("Class A1");
	}
}
class B1 extends A1
{
	B1()
	{
		System.out.println("Class B");
	}
	B1(int x)
	{
		System.out.println("Class B1");
	}
}
class C1 extends B1
{
	C1()
	{
		System.out.println("Class C");
	}
	C1(int x)
	{
		System.out.println("Class C1");
	}
}
public class Day3_9 {
	public static void main(String args[])
	{
		C1 obj= new C1(5);

	}
}
