package com.vcs.lects.l13.unittests.library;

import org.junit.Before;
import org.junit.Test;
import org.mockito.verification.VerificationMode;

import static org.mockito.Mockito.*;

import java.util.ArrayList;

import com.vcs.lects.l13.unittests.library.resources.IBookResource;

public class LibraryMockTest {

	private IBookResource resource;
	private Library library;

	@Before
	public void init() {

		resource = mock(IBookResource.class);

		library = new Library(resource);
	}

	@Test
	public void searchTest() {

		when(resource.getAllBooks()).thenReturn(new ArrayList<Book>());
		when(resource.getAvailableBooks()).thenReturn(new ArrayList<Book>());

		library.searchAvaliableBooksByName("0238409234");

		verify(resource, only()).getAvailableBooks();
		verify(resource, never()).getAllBooks();

	}

}
