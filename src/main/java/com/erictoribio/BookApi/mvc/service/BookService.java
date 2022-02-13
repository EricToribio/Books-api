package com.erictoribio.BookApi.mvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.erictoribio.BookApi.mvc.models.Book;
import com.erictoribio.BookApi.mvc.repositories.BookRepository;

@Service
public class BookService {
	// adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    public Book updateBook(
    		Long id, 
    		String title, 
    		String description, 
    		String language, 
    		Integer numberOfPages) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			Book book = optionalBook.get();
			book.setTitle(title);
			book.setDescription(description);
			book.setLanguage(language);
			book.setNumberOfPages(numberOfPages);
			return bookRepository.save(book);
		} else {
			return null;
		}	
	}
    public String delete(Long id) {
    	Optional<Book> optionalBook = bookRepository.findById(id);
    	if(optionalBook.isPresent()) {
			bookRepository.deleteById(id);
			return "Deleted";
		} else {
			return "No book to delete";
		}
    }
}
