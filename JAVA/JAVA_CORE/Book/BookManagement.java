package Book;

import java.util.HashMap;



public class BookManagement {

	HashMap<Integer, Book> map = new HashMap<>();
	public boolean addBook(Book bk)
	{
		map.put(bk.getIsbn(), bk);
		return true;
	}
}
