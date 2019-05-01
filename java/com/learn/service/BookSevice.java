package com.learn.service;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.learn.inventory.Book;

@Service
public class BookSevice {
	
	@Autowired
	private CrudRepository<Book, Integer> cr;
 
	/*@Autowired
	private BookRepository bookRepository;*/
	List<Book> booksList = new ArrayList<Book>();
	
	public List<Book> getAllUser(){
		/*bookRepository.findAll()*/
		 cr.findAll()
		.forEach(booksList::add);
		return booksList;
	}

	public Book getBook(int index) {
		/*return bookRepository.findById(index).get();*/
		return cr.findById(index).get();
	}

	public void addBook(Book book) {
		/*bookRepository.save(book);*/
		cr.save(book);
	}

	public Book updateBook(int index, Book book) {
		/*return bookRepository.save(book);*/
		return cr.save(book);
	}

	public void deletBook(int index) {
		/*bookRepository.deleteById(index);;*/
		cr.deleteById(index);
	}
	
	
}
