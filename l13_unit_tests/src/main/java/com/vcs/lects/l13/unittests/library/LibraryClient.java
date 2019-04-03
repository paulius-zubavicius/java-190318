/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l13.unittests.library;

import com.vcs.lects.l13.unittests.library.resources.BooksResource;
import com.vcs.lects.l13.unittests.library.resources.IBookResource;
import java.util.List;

/**
 *
 * @author owr
 */
public class LibraryClient {

    public static void main(String[] args) {

        IBookResource booksRes = new BooksResource();

        Library library = new Library(booksRes);
        List<Book> availableBooks = library.searchAvaliableBooksByName("cookbook");

        
        System.out.println("SEARCHING...");
        for (Book book : availableBooks) {
            System.out.println("BOOK: " + book.getName());
        }

        
          System.out.println("DONE!");
    }
}
