package com.day4;

abstract class ServiceStation{
	
	String city;
	
	ServiceStation(){}
	
	ServiceStation(String b){
		city=b;
	}
	
	abstract void doservice();
}

class TwoWheelers extends ServiceStation{
	String city;
	
	
	void doservice() {
		System.out.println("Two Wheeler Service Station");
	}
}

class FourWheelers extends ServiceStation{
	String city;
	
	void doservice() {
		System.out.println("Four Wheeler Service Station");
	}
}

public class AbstractEx {

	public static void main(String[] args) {
		ServiceStation o1;
		o1 = new TwoWheelers();
		o1.doservice();
		o1 = new FourWheelers();
		o1.doservice();
	}

}
