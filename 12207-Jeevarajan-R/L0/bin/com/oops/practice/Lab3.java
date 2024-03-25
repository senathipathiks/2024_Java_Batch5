package oops.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class Restaurant {
	String items;
	int price;
	double rating;
	
	Restaurant(String it, int pr, double rt){
		items = it;
		price = pr;
		rating = rt;
	}
	
	public void display() {
		System.out.println("Item : "+items );
		System.out.println("Price : "+price );
		System.out.println("Rating : "+rating );
		System.out.println("-------------------------------");
	}
	public double rat() {
		return rating;
	}
	
}

class RestaurantMenu{
	Scanner sc = new Scanner(System.in);
	HashMap<String,Restaurant> hm = new HashMap<>(); 
	void addMenu(){
		System.out.println("Enter menu item : ");
		String it = sc.next();
		System.out.println("Enter menu price : ");
		int pr = sc.nextInt();
		System.out.println("Enter menu rating : ");
		double rt = sc.nextDouble();
		Restaurant r = new Restaurant(it,pr,rt); 
		hm.put(it, r);
	}
	
	boolean removeItem(String itm) {
		if(hm.remove(itm) != null) {
			return true;
		}else return false;
	}
	
	void viewMenu() {
		Iterator <String> it = hm.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next(); 
			hm.get(key).display();
		}
	}
	void calAvgRating() {
		double avg = 0;
		int ct = 0;
		Iterator <String> it = hm.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next(); 
			avg += hm.get(key).rat();
			ct++;
		}
		avg = avg/ct;
		System.out.println("OverAll Rating of Restaurant is : "+avg);
	}
}


public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestaurantMenu rm = new RestaurantMenu();
		rm.addMenu();
		rm.addMenu();
		rm.viewMenu();
//		rm.removeItem("noodles");
		rm.calAvgRating();

	}

}
