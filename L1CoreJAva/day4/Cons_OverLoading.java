package com.day4;
class Vicky{
	int rollno;
	String name;
	Vicky(){
		rollno = 12;
		name="";
	}
	Vicky(int no)
	{
		rollno=no;
		name="Vicky";
	}
	Vicky(int no, String name){
		rollno=no;
		name=name;
	}
}
public class Cons_OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vicky v = new Vicky();
		Vicky v1 = new Vicky(121);
		Vicky v2 = new Vicky(122,"Velan");
		System.out.println(v2);

	}

}
