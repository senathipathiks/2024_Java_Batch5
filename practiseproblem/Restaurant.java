package com.practiseproblem;


import java.util.ArrayList;
import java.util.Scanner;

class RestaurantManagement{
	String items;
	double price;
	int rating;
	
	
	
	
	RestaurantManagement(String items,double price,int rating){
		this.items = items;
		this.price = price;
		this.rating = rating;
		
	}
	
}
class AddRetrive1 {
	ArrayList<RestaurantManagement> list1 = new ArrayList<>();
	void add(RestaurantManagement R) {
		list1.add(R);
	}
	
	void remove(String item) {
		for(RestaurantManagement i : list1) {
			if(i.items.equals(item)) {
				list1.remove(i);
				System.out.println("item removes successfully");
				return;
			
			}
		}
		System.out.println("Data not found");
	}
	
	void average() {
		int ratingresult = 0;
		int ratingcount = 0;
		for(RestaurantManagement i : list1) {
			ratingresult += i.rating;
			ratingcount++;
		}
		System.out.println("Rating average : "+ratingresult/ratingcount);
	}
	void display() {
		for(RestaurantManagement i : list1) {
			System.out.println("Item : " + i.items);
			System.out.println("Price : " + i.price);
			System.out.println("Rating : " + i.rating);
			
			System.out.println("-------------------------------------");
		}
	}
	
}
public class Restaurant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		RestaurantManagement R1 = new RestaurantManagement("Idli",5.5,4);
		RestaurantManagement R2 = new RestaurantManagement("Doosha",25,4);
		RestaurantManagement R3 = new RestaurantManagement("Poori",40,3);
		
		AddRetrive1 A1 = new AddRetrive1();
		A1.add(R1);
		A1.add(R2);
		A1.add(R3);
		A1.display();
		
		System.out.println("Enter the item to remove : ");
		String item = sc.next();
		A1.remove(item);
		
	    A1.average();
		
		
	}
	

}
