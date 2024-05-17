package Exercises;
import java.util.Scanner;
class BookName
{
	String name;
	String author;
	String title;
	int isbn;
	BookName(String name,String author,String title,int isbn)
	{
		this.name=name;
		this.author=author;
		this.title=title;
		this.isbn=isbn;
	}
	void display()
	{
		System.out.println("Book Name:"+name);
		System.out.println("Author:"+author);
		System.out.println("Title:"+title);
		System.out.println("ISBN:"+isbn);
	}
}
class AddBook extends BookName{
//	ArrayList<Integer> list = new ArrayList<>();
	AddBook(String name,String author,String title,int isbn)
	{
		super(name,author,title,isbn);
//		System.out.println(list.add(isbn));
		System.out.println("Book added successfully");
	}
	void display()
	{
		super.display();
	}
}
public class Book {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book name,author,title,isbn");
		AddBook ab = new AddBook(sc.next(),sc.next(),sc.next(),sc.nextInt());
		ab.display();
	}

}