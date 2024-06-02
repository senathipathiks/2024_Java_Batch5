package com.day9;

class TwoWheeler {
	TwoWheeler() {
		super();
		System.out.println("A");
	}
	
}

class TwoWheeler1 extends TwoWheeler {
	TwoWheeler1() {
		System.out.println("B");
	}
	TwoWheeler1(int a){
		System.out.println("B 1");
	}
}

public class ConsructorInvoc extends TwoWheeler1{
	 ConsructorInvoc(int e) {
		 System.out.println("C");
	 }
	 ConsructorInvoc() {
		 this(4);
		 System.out.println("C 1");
	 }

	public static void main(String[] args) {
		ConsructorInvoc cv1 = new ConsructorInvoc();
		
	}

}
