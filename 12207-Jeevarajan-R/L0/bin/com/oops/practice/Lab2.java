package oops.practice;

import java.util.ArrayList;

class Movie {
	String title = "";
	String director = "";
	String actor = "";
	ArrayList<String> review = new ArrayList<>();
	
	Movie(String title, String director, String actor){
		this.title = title;
		this.director = director;
		this.actor = actor;
	}
	
	boolean addReview(String rev) {
		return review.add(rev);
	}
	
	void retrieveReview(){
		System.out.println("Title : "+title);
		System.out.println("Director : "+director);
		System.out.println("Actor : "+actor);
		for(String r : review) {
			System.out.println(r);
		}
	}
	
}
public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie m = new Movie("After","James","Hero");
		m.addReview("I love this movie");
		m.addReview("I hate his acting of hero");
		m.retrieveReview();
		
	}

}
