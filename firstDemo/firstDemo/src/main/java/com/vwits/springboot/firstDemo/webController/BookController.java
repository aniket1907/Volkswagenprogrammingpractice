package com.vwits.springboot.firstDemo.webController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.vwits.springboot.firstDemo.dao.BookDao;
import com.vwits.springboot.firstDemo.model.Book;

@Controller
public class BookController {

	@Autowired
	BookDao bookDao;
	
	@GetMapping("getBook/{bookId}")
	public String getBookDetails(@PathVariable int bookId, ModelMap model) {
		Book b =this.bookDao.getBook(bookId);
		
		System.out.println("here");

		if(b != null) {
			model.addAttribute("Book", b);
			
		} else {
			model.addAttribute("message", "book not found, bookId = " + bookId); 
		}
		return "book";
	}
}
