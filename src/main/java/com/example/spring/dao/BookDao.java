package com.example.spring.dao;

import java.util.List;

import com.example.spring.model.Book;

public interface BookDao {
	
	long save(Book book);
	Book get(long id);
	void update(long id, Book book);
	void delete(long id);
	List<Book> list();
}
