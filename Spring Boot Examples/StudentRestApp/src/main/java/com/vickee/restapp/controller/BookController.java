package com.vickee.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vickee.restapp.model.Books;
import com.vickee.restapp.serviceimpl.BookServiceImpl;

@RestController
@RequestMapping("/book")
@CrossOrigin("*")
public class BookController {
	
	@Autowired
	BookServiceImpl service;
	
	static final String SUCESS="Success";
	static final String FAILURE="Failure";

	@PostMapping
	public String insertBook(@RequestBody Books book) {
		String msg=" ";
		try {
			service.addBook(book);
			msg=SUCESS;
		}
		catch(Exception e) {
			e.printStackTrace();
			msg=FAILURE;
		}
		return msg;
	}
	@GetMapping("{id}")
	public Books getBooksById(@PathVariable("id") int id) {
		return service.getBooks(id);
	}
	@GetMapping("/all")
	public List<Books> getBooks() {
	return service.getAllBooks();
}
	@PutMapping
	public String updateBooks(@RequestBody Books book) {
		String msg=" ";
		try {
			service.updateBooks(book);
			msg=SUCESS;
		}
		catch(Exception e){
			e.printStackTrace();
			msg=FAILURE;
		}
	return msg;
	}
	@DeleteMapping("{id}")
	public String deleteBookById(@PathVariable("id") int id) {
		String msg=" ";
		try {
			service.deleteBooks(id);
			msg=SUCESS;
		}
		catch(Exception e){
			e.printStackTrace();
			msg=FAILURE;
		}
		return msg;
	}
}
