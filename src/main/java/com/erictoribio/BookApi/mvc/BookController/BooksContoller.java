package com.erictoribio.BookApi.mvc.BookController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.erictoribio.BookApi.mvc.models.Book;
import com.erictoribio.BookApi.mvc.service.BookService;
@Controller
public class BooksContoller {
	 private final BookService bookService;
	    public BooksContoller(BookService bookService){
	        this.bookService = bookService;
	    }

	@GetMapping("/book/{id}")
    public String showOneBook(@PathVariable("id") Long id ,Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "index.jsp";
	}

}
