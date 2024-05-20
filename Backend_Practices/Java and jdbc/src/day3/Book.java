package day3;

public class Book 
{
	private String title;
	private String author;
	private String isbn;
	
	Book (String title, String author, String isbn)
	{
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	void display()
	{
		System.out.println("Book - " + title);
		System.out.println("Author - " + author);
		System.out.println("ISBN - " + isbn);
	}
	public static void main(String[] args) 
	{
		Book obj = new Book ("Mahabharatham", "Vaazhmiki", "asdf-lkjh");
		obj.display();
	}

}
