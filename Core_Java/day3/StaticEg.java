package com.day3;


class Static{
//	int count; //instance variable
	
	static int count; //static variable
	
	Static(){
		count++;
	}
	
	void display() {
		System.out.println(count);
	}
	
}

public class StaticEg {
  public static void main(String args[]) {
	  Static obj = new Static();
	  obj.display();
	  
	  Static obj1 = new Static();
	  obj1.display();
  }
}
