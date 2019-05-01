package com.learn.inventory;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	private int index;
	private String bookName;
	private String authorName;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int index, String bookName, String authorName) {
		super();
		this.index = index;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	

}
