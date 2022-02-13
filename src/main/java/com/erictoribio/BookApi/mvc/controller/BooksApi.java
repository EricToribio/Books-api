package com.erictoribio.BookApi.mvc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.erictoribio.BookApi.mvc.models.Book;
import com.erictoribio.BookApi.mvc.service.BookService;

@RestController
public class BooksApi {
	 private final BookService bookService;
	    public BooksApi(BookService bookService){
	        this.bookService = bookService;
	    }
	    @GetMapping("/api/books")
	    public List<Book> index() {
	        return bookService.allBooks();

	    }
	    
	    @PostMapping(value="/api/new/book")
	    public Book create(
	    		@RequestParam(value="title") String title,
	    		@RequestParam(value="description") String desc,
	    		@RequestParam(value="language") String lang,
	    		@RequestParam(value="pages") Integer numOfPages) {
	        Book book = new Book(title, desc, lang, numOfPages);
	        return bookService.createBook(book);
	    }
	    
	    @RequestMapping("/api/books/{id}")
	    public Book show(@PathVariable("id") Long id) {
	        Book book = bookService.findBook(id);
	        return book;
	    }
	    
	    @PutMapping("/api/books/update/{id}")
	    public Book update(
	    		@PathVariable("id") Long id,
	    		@RequestParam("title") String title,
	    		@RequestParam("description") String desc,
	    		@RequestParam("language") String lang,
	    		@RequestParam("pages") Integer numOfPages
	    		) {
	    	Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
			return book;
	    }
	    @DeleteMapping("/api/delete/book/{id}")
	    public String destroy(@PathVariable("id") Long id) {
	    	return bookService.delete(id);
	        
	    }
	   
}
