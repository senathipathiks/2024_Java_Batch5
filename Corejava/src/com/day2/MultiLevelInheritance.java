package com.day2;

class A
{
	A(){System.out.println("Class A");};
	A(int x){System.out.println("Class A-1");};
}
class B extends A
{
	B(){System.out.println("Class B");};
	B(int x){System.out.println("Class B-1");};
}
class C extends B
{
	C(){System.out.println("Class C");};
	C(int x){System.out.println("Class C-1");};
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		C obj1 = new C(5);

	}

}
