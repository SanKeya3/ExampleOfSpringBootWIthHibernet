package com.learn.repository;



import org.springframework.data.repository.CrudRepository;

import com.learn.inventory.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
