package day5;

import java.util.*;

class Movie1{
	private String title;
	private String director;
	private List<String> actors;
	private List<String> reviews;
	
	public Movie1(String title, String director, List<String> actors) {
		this.title = title;
		this.director = director;
		this.actors = actors;
		this.reviews = new ArrayList<>();
	}
	
	public void addReview(String review) {
		reviews.add(review);
	}
	
	public List<String> getReviews() {
		return reviews;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDirector() {
		return director;
	}
	
	public List<String> getActors() {
		return actors;
	}
}
public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> actors = new ArrayList<>();
		actors.add("vijay");
		actors.add("Actor2");
		
		Movie1 movie = new Movie1("leo", "Loki", actors);
		
		movie.addReview("Great Movie!");
		movie.addReview("The performances were outstanding");
		
		System.out.println("Movie Title:"+ movie.getTitle());
		System.out.println("Director:"+ movie.getDirector());
		System.out.println("Actors:"+ movie.getActors());
		System.out.println("Reviews:"+ movie.getReviews());


	}

}
