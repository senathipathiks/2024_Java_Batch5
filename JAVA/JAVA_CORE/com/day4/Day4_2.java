package com.day4;

public class Day4_2 {
	int rollno;
	String name;
	Day4_2()
	{
		rollno=0;
		name=" ";
	}
	Day4_2(int r)
	{
		rollno=r;
		name=" ANi";
	}

	Day4_2(int r,String s)
	{
		rollno=0;
		name=s;
	}


	public static void main(String[] args) {
		Day4_2 obj=new Day4_2();
		Day4_2 obj1=new Day4_2(1);
		Day4_2 obj2=new Day4_2(1,"AJI");

	}

}
