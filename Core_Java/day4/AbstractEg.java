package com.day4;

abstract class ServiceStation{
	String city;
	ServiceStation(){
	}
	ServiceStation(String s){
		city = s;
		System.out.println(s);
	}
	abstract void service();
}

class TwoWheelerStation extends ServiceStation{
	TwoWheelerStation(){
		
	}
	TwoWheelerStation(String s){
		super(s);
	}
	void service() {
		System.out.println("Two wheeler Service station");
	}
}
class FourWheelerStation extends ServiceStation{
	FourWheelerStation(){
		
	}
	FourWheelerStation(String s){
		super(s);
	}
	void service() {
		System.out.println("Four wheeler Service station");
	}
}
public class AbstractEg {

	public static void main(String[] args) {
		ServiceStation s; //reference created
		s = new TwoWheelerStation("Dindigul");
		s.service();
		s = new FourWheelerStation("Dindigul");
		s.service();
		
		

	}

}
