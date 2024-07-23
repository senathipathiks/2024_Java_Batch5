package com.day4;

public class OverLoadingEx2 {

	int rno;
	String name;
	
	OverLoadingEx2(){
		rno = 2;
		name =" ";
		System.out.println(rno+" "+name);
	}
	
	OverLoadingEx2(int a){
		rno = a;
		name = "N S";
		System.out.println(rno+" "+name);
	}
	
	OverLoadingEx2(int a,String b){
		rno = a;
		name = b;
		System.out.println(rno+" "+name);
	}
	
	public static void main(String[] args) {
		OverLoadingEx2 o = new OverLoadingEx2();
		OverLoadingEx2 o1 = new OverLoadingEx2(12);
		OverLoadingEx2 o2 = new OverLoadingEx2(21,"Nagarjun");
	}

}
