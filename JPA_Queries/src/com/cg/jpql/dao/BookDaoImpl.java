package com.cg.jpql.dao;

import java.util.List;

import com.cg.jpql.entities.Book;

/*
 * In software, 
 * a data access object (DAO) is a pattern that provides 
 * an abstract interface to some type of database or other persistence mechanism. 
 * By mapping application calls to the persistence layer, 
 * the DAO provides some specific data operations without exposing details of the database.
 * */

public interface BookDaoImpl {
	Book getBookById(int id);

	List<Book> getBookByTitle(String title);

	Long getBookCount();

	List<Book> getAuthorBooks(String author);

	List<Book> getAllBooks();

	List<Book> getBooksInPriceRange(double low, double high);

}