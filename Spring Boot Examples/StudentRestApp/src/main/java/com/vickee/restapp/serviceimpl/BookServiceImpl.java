package com.vickee.restapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.Books;
import com.vickee.restapp.repository.BookRepo;
import com.vickee.restapp.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepo repo;
	@Override
	public void addBook(Books book) {
		repo.save(book);
	}
	@Override
	public Books getBooks(int id) {
		Optional<Books> bookOptional = repo.findById(id);
		return bookOptional.orElse(null);
	}
	@Override
	public List<Books> getAllBooks() {
		return repo.findAll();	}
	@Override
	public void updateBooks(Books book) {
		repo.save(book);
		
	}
	@Override
	public void deleteBooks(int id) {
		repo.deleteById(id);
	}
	
}
