package com.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.book.entity.BookEntity;
import com.book.repository.BookRepository;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public BookEntity saveBook(BookEntity bookEntity) {
		// TODO Auto-generated method stub
		log.info("Inside saveBook of BookService");
		return bookRepository.save(bookEntity);
	}

	public BookEntity findBookById(Long bookId) {
		// TODO Auto-generated method stub
		log.info("Inside saveBook of BookService");
		return bookRepository.findByBookId(bookId);
	
	}
	
}
