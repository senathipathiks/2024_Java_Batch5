package com.assignments;
import java.util.*;

interface Flight{
	void message();
	void bookFlight();
	void cancleFlight();
	void bookHotel();
	void cancleHotel();
}

abstract class FlightAbstract implements Flight {
	public void message() {
		System.out.println("Welcome");
	}
	
	public abstract void bookFlight();
	public abstract void cancleFlight();
	public abstract void bookHotel();
	public abstract void cancleHotel();
}

class FlightOperation extends FlightAbstract{

	public void bookFlight() {
		System.out.println("Flight Booked");
	}

	public void cancleFlight() {
		System.out.println("Flight Cancled");
	}

	public void bookHotel() {
		System.out.println("Hotel Booked");
	}

	public void cancleHotel() {
		System.out.println("Hotel Cancled");
	}
	
}

public class Flights {
	public static void main(String[] args) {
		FlightOperation fo = new FlightOperation();
		fo.bookFlight();
		fo.bookHotel();
		fo.cancleFlight();
		fo.cancleHotel();
	}
}
