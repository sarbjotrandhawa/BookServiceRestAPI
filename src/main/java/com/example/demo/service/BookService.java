package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;

public interface BookService {
	Book addBook(Book book);

	Book updateBook(Book book);

	Book getBook(long id);

	String deleteBook(long id);

	List<Book> getAllBook();

}
