package com.day3;

import java.util.*;
 class Book {
 private String title;
 private String author;
 private String isbn;

 public Book(String title, String author, String isbn) {
     this.title = title;
     this.author = author;
     this.isbn = isbn;
 }

 public String getTitle() {
     return title;
 }

 public void setAuthor(String author) {
     this.author = author;
 }

 public String getIsbn() {
     return isbn;
 }

 @Override
 public String toString() {
     return "Title: " + title + "\nAuthor: " + author + "\nISBN: " + isbn;
 }
}


public class BooksMain{
 private ArrayList<Book> books;

 public BooksMain() {
     this.books = new ArrayList<>();
 }

 public void addBook(Book book) {
     books.add(book);
 }

 public void removeBook(Book book) {
     books.remove(book);
 }

 public void displayBooks() {
     for (Book book : books) {
         System.out.println(book);
     }
 }

 public static void main(String[] args) {
     Book book1 = new Book("The Great", "F. Scott ", "978-0743273565");
     Book book2 = new Book(" a Mockingbird", " Lee", "978-0061120084");

     BooksMain collection = new BooksMain();
     collection.addBook(book1);
     collection.addBook(book2);

     System.out.println("Books in the collection:");
     collection.displayBooks();

     collection.removeBook(book1);
     System.out.println("\nAfter removing a book:");
     collection.displayBooks();
 }
}
