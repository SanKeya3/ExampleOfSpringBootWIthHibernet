package com.learn.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learn.inventory.Book;
import com.learn.service.BookSevice;

@RestController
public class ExampleController {
	
	/* we have to create this methods
	 *  getAllBooks();
	 *  getBook(int index);
	 *  addBook(Book Book);
	 *  updateBook(int index, Book book);
	 *  deletBook(int index);
*/
	
	
	@Autowired
	BookSevice bookService;
	
	@RequestMapping("/booklist")
	public List<Book> getAllUser(){
		return bookService.getAllUser();
	}
	
	@RequestMapping("/boolist/{index}")
	public Book getBook(@PathVariable int index) {
		return bookService.getBook(index);	
	}
	
	@RequestMapping(method = RequestMethod.POST , value =("/booklist"))
	public void addBook(@RequestBody Book book) {
		bookService.addBook(book);
	}
	
	@RequestMapping(method = RequestMethod.PUT ,  value=("/booklist/{index}"))
	public Book updateBook(@PathVariable int index,@RequestBody Book book) {
		return bookService.updateBook(index, book);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value =("/booklist/{index}"))
	public void deletBookInformation(@PathVariable int index) {
		bookService.deletBook(index);
	}
	
}
