package com.KPI.LibraryWebApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.KPI.LibraryWebApplication.entity.Book;
import com.KPI.LibraryWebApplication.repository.BookRepository;

@RestController
public class BookController {
	@Autowired
	private BookRepository bookrepository;
	
	@GetMapping("/book{id}")
	public List<Book> getDetailsById(@PathVariable("id") Integer id){
		return bookrepository.getBookDetails(id);
	}
	
	@GetMapping("/book")
	public List<Book> getAllDetails(){
		return bookrepository.getAllBookDetails();
	}
	

}
