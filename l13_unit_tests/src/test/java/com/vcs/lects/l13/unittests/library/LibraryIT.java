package com.vcs.lects.l13.unittests.library;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LibraryIT {

	@Test
	public void search() {

		Library library = new Library();
		List<Book> availableBooks = library.searchAvaliableBooksByName("792387492734972349723947932874dsfsf");

		Assert.assertEquals(0, availableBooks.size());
	}

}
