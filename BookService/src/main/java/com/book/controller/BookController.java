package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.BookEntity;
import com.book.service.BookService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/books")
@Slf4j
public class BookController {

	@Autowired
	private BookService bookService; 
	
	@PostMapping("/")
	public BookEntity saveBook(@RequestBody BookEntity bookEntity) {
		log.info("Inside saveBook method of BookController");
		return bookService.saveBook(bookEntity);
	
	}
	
	@GetMapping("/{id}")
	public BookEntity findbookById (@PathVariable("id") Long bookId) {
		
		log.info("Inside findBookById method of BookController");
		return bookService.findBookById(bookId);
	
	}
	
}
