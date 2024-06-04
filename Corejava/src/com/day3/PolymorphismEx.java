package com.day3;

public class PolymorphismEx { // Constructor Overloading
	
	int rollno;
	String name;
	
	PolymorphismEx()
	{
		rollno = 0;
		name = "";
	}

	PolymorphismEx(int r)
	{
		rollno = r;
		name = "Relevantz";
	}
	PolymorphismEx(int r,String s)
	{
		rollno = r;
		name = s;
	}
	public static void main(String[] args) {
		PolymorphismEx obj1 = new PolymorphismEx(); //0,null
		PolymorphismEx obj2 = new PolymorphismEx(12); //12,Relevantz
		PolymorphismEx obj3 = new PolymorphismEx(13,"Arun"); //13,Arun
		

	}

}
