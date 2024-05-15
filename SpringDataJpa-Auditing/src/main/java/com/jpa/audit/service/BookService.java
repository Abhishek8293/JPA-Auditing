package com.jpa.audit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.audit.entity.Book;
import com.jpa.audit.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

	public Book addBook(Book book) {
		return this.bookRepository.save(book);
	}

	public Book updateBook(Book book, Integer id) {
		Book existingBook = this.bookRepository.findById(id).get();
		
		existingBook.setBookName(book.getBookName());
		existingBook.setAuthorName(book.getAuthorName());
		
		return this.bookRepository.save(existingBook);
		
	}

	public List<Book> getBooks() {
		return this.bookRepository.findAll();
	}

	
	

}
