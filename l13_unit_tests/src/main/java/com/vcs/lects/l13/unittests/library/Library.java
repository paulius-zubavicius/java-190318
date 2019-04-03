/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l13.unittests.library;

import com.vcs.lects.l13.unittests.library.resources.BooksResource;
import com.vcs.lects.l13.unittests.library.resources.IBookResource;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author owr
 */
public class Library {

	private IBookResource booksResource = null;

	public Library(IBookResource booksResource) {
		this.booksResource = booksResource;

	}

	public Library() {
		this.booksResource = new BooksResource();

	}

	public List<Book> searchAvaliableBooksByName(String name) {

		List<Book> searchResult = new ArrayList<>();

		for (Book book : booksResource.getAvailableBooks()) {
			if (filterCheck(book, name)) {
				searchResult.add(book);
			}
		}

		return searchResult;
	}

	private boolean filterCheck(Book book, String name) {

		if (name.isEmpty()) {
			return false;
		}
		return book.getName().toLowerCase().contains(name.toLowerCase());
		// return book.isAvailable() && isNameContainsIgnCase;

	}

}
