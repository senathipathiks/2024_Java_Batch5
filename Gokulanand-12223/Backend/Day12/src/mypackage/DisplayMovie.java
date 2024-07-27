package mypackage;
import java.util.*;
class Movie
{
	String title, director, actor, review;
	void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title :");
		title = sc.next();
		System.out.println("Enter the director :");
		director = sc.next();
		System.out.println("Enter the actor :");
		actor = sc.next();
		System.out.println("Enter the review :");
		review = sc.next();
	}
	void display()
	{
		System.out.println("Title is "+title);
		System.out.println("Director is "+director);
		System.out.println("Actor is "+actor);
		System.out.println("Review is "+review);
	}
}
public class DisplayMovie
{

	public static void main(String[] args)
	{
		Movie obj = new Movie();
		obj.get();
		obj.display();
	}

}
