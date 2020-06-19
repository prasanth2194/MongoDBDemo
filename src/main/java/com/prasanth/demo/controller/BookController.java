package com.prasanth.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prasanth.demo.model.Book;
import com.prasanth.demo.repository.BookRepository;

@RestController
public class BookController {
	@Autowired
	private BookRepository bookrepository;
	
	@PostMapping("/add")
	public int addBook(@RequestBody Book book) {
		bookrepository.save(book);
		return book.getId();
		
	}
	@GetMapping("/get")
	public List<Book> getBook(){
		return bookrepository.findAll();
		
	}

}
