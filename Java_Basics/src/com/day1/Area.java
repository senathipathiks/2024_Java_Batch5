package com.day1;

public class Area {
	public static void main(String args[]){
		double a,p,r;
		r=Integer.parseInt(args[0]);
		a=3.14*r*r;
		p=2*3.14*r;
		System.out.println("Area of Circle:"+a);
		System.out.println("Perimeter of Circle:"+p);
		}
}
