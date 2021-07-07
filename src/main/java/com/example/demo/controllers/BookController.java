package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@PostMapping("/book")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}

	@PutMapping("/book")
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}

	@GetMapping("/book/{id}")
	public Book getBook(@PathVariable long id) {
		return bookService.getBook(id);
	}

	@GetMapping("/book")
	public List<Book> getAllBook() {
		return bookService.getAllBook();
	}

	@DeleteMapping("/book/{id}")
	public String deleteBook(@PathVariable long id) {
		return bookService.deleteBook(id);
	}
}
