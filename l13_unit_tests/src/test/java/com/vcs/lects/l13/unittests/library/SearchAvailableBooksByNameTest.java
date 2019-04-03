/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l13.unittests.library;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.vcs.lects.l13.unittests.library.resources.IBookResource;

public class SearchAvailableBooksByNameTest {

	private List<Book> books = null;
	private List<Book> booksAvailable = null;
	private Library library = null;

	@Before
	public void init() {
		books = new ArrayList<>();
		books.add(new Book("0", "JAVA", true));
		books.add(new Book("1", "j a v a", true));
		books.add(new Book("2", "Java kava", false));
		books.add(new Book("3", "JaVa", true));
		books.add(new Book("4", "bilekas java   kazkas   ", true));
		books.add(new Book("5", "kava su java", true));

		booksAvailable = new ArrayList<>();
		booksAvailable.add(new Book("0", "JAVA", true));
		booksAvailable.add(new Book("1", "j a v a", true));
//		booksAvailable.add(new Book("2", "Java kava", false));
		booksAvailable.add(new Book("3", "JaVa", true));
		booksAvailable.add(new Book("4", "bilekas java   kazkas   ", true));
		booksAvailable.add(new Book("5", "kava su java", true));

		library = new Library(new IBookResource() {
			@Override
			public List<Book> getAllBooks() {
				return books;
			}

			@Override
			public List<Book> getAvailableBooks() {
				return booksAvailable;
			}
		});
	}

	@Test
	public void successLowerCaseTest() {

		List<Book> availableBooks = library.searchAvaliableBooksByName("java");

		Assert.assertEquals(4, availableBooks.size());

		Assert.assertEquals("0", availableBooks.get(0).getCodeISBN());
		Assert.assertEquals("3", availableBooks.get(1).getCodeISBN());
		Assert.assertEquals("4", availableBooks.get(2).getCodeISBN());
		Assert.assertEquals("5", availableBooks.get(3).getCodeISBN());

	}

	@Test
	public void successUpperCaseTest() {

		List<Book> availableBooks = library.searchAvaliableBooksByName("JAVA");

		Assert.assertEquals(4, availableBooks.size());

		Assert.assertEquals("0", availableBooks.get(0).getCodeISBN());
		Assert.assertEquals("3", availableBooks.get(1).getCodeISBN());
		Assert.assertEquals("4", availableBooks.get(2).getCodeISBN());
		Assert.assertEquals("5", availableBooks.get(3).getCodeISBN());

	}

	@Test
	public void successMixedCaseTest() {

		List<Book> availableBooks = library.searchAvaliableBooksByName("jaVA");

		Assert.assertEquals(4, availableBooks.size());

		Assert.assertEquals("0", availableBooks.get(0).getCodeISBN());
		Assert.assertEquals("3", availableBooks.get(1).getCodeISBN());
		Assert.assertEquals("4", availableBooks.get(2).getCodeISBN());
		Assert.assertEquals("5", availableBooks.get(3).getCodeISBN());

	}

	@Test
	public void failTest() {
		List<Book> availableBooks = library.searchAvaliableBooksByName("js");
		Assert.assertEquals(0, availableBooks.size());
	}

	@Test
	public void emptyTest() {
		List<Book> availableBooks = library.searchAvaliableBooksByName("");
		Assert.assertEquals(0, availableBooks.size());
	}

	@Test(expected = NullPointerException.class)
	public void nullTest() {
		library.searchAvaliableBooksByName(null);
		Assert.fail();
	}

}
