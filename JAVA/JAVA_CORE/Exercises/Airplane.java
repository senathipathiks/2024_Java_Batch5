package Exercises;

import java.util.ArrayList;
import java.util.Scanner;
class Flight
{
	String time;
	String departure;
	String destination;
	
	Flight(String time,String departure,String destination)
	{
		this.time=time;
		this.departure=departure;
		this.destination=destination;
		
	}
	void display()
	{
		System.out.println("Time:"+time);
		System.out.println("Departure:"+departure);
		System.out.println("Destination:"+destination);
		
	}
}
class Status extends Flight{
//	ArrayList<Integer> list = new ArrayList<>();
	String status;
	String delay;
	Status(String time,String departure,String destination,String status)
	{
		super(time,departure,destination);
//		System.out.println(list.add(isbn));
		this.status=status;
		this.delay=delay;
	}
	void display()
	{
		super.display();
	}
}
public class Airplane {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book name,author,title,isbn");
		AddBook ab = new AddBook(sc.next(),sc.next(),sc.next(),sc.nextInt());
		ab.display();
	}

}
