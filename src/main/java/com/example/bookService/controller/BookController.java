package com.example.bookService.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookService.entity.BookEntity;
import com.example.bookService.repository.BookRepository;

@RestController
@RequestMapping(value = "/book")
public class BookController {

	Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	public BookRepository bookRepo;
	
	@GetMapping
	public List<BookEntity> getAllBooks() {
		logger.info("BookController::Inside Get All books method");
		return bookRepo.getAllBooks();
	}
	

}
