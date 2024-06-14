package taskClass;
import java.util.*;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Main.java
		
		    Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
		    Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");
		    Book.add_Book(book1);
		    Book.add_Book(book2);
		    ArrayList < Book > bookCollection = Book.get_BookCollection();
		    System.out.println("List of books:");
		    for (Book book: bookCollection) {
		      System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
		    }
		    Book.remove_Book(book1);
		    System.out.println("\nAfter removing " + book1.get_Title() + ":");
		    System.out.println("List of books:");
		    for (Book book: bookCollection) {
		      System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
		    }
		  }
		


	}


