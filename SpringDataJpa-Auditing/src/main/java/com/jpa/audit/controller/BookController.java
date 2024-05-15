package com.jpa.audit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.audit.entity.Book;
import com.jpa.audit.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	
	@PostMapping("/add/book")
	public Book addBook(@RequestBody Book book) {
		return this.bookService.addBook(book);
	}
	
	@PutMapping("/update/book/{id}")
	public Book updateBook(@RequestBody Book book, @PathVariable Integer id) {
		return this.bookService.updateBook(book,id);
	}
	
	@GetMapping("/get/books")
	public List<Book> getBooks(){
		return this.bookService.getBooks();
	}
	
	

}
