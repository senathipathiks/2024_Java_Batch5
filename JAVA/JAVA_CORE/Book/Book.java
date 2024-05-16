package Book;

public class Book {

	private int isbn;
	private String name;
	private String author;
	private String title;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Book(int isbn, String name, String author, String title) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.title = title;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	void display()
	{
		System.out.println("Book Name:"+name);
		System.out.println("Author:"+author);
		System.out.println("Title:"+title);
		System.out.println("ISBN:"+isbn);
	}

}
