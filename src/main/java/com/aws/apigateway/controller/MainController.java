package com.aws.apigateway.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.apigateway.model.Book;

@RestController
@RequestMapping("/book")
public class MainController {

	List<Book> books = new ArrayList<Book>();

	Book bk = new Book(1, "java", 123.21);
	Book bk1 = new Book(2, "spring", 43.8);
	int i = 0;

	@GetMapping
	public List<Book> books() {
		if (i == 0) {
			books.add(bk);
			books.add(bk1);
			i =1;
		}
		return books;
	}

	@PostMapping
	public Book books_post(@RequestBody Book book) {
		books.add(book);
		return book;
	}

}
