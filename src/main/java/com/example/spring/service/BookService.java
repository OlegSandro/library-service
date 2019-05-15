package com.example.spring.service;

import java.util.List;

import com.example.spring.model.Book;

public interface BookService {
	
	long save(Book book);
	Book get(long id);
	void update(long id, Book book);
	void delete(long id);
	List<Book> list();
}
