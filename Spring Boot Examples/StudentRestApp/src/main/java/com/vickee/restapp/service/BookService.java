package com.vickee.restapp.service;

import java.util.List;

import com.vickee.restapp.model.Books;

public interface BookService {
	
	public void addBook(Books book);
	public Books getBooks(int id);
	public List<Books> getAllBooks();
	public void updateBooks(Books book);
	public void deleteBooks(int id);	
}
