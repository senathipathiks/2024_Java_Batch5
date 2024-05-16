package com.day4;
class Vickee{
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void add() {
		System.out.println();
	}
	int add(int a,int b,int c,int d) {
		return a+b+c+d;
	}
}
public class MethodOverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vickee v = new Vickee();
		v.add(2,6);
		v.add();
		v.add(2, 5, 10);
		System.out.println(v.add(1, 1, 1, 1));

	}

}
