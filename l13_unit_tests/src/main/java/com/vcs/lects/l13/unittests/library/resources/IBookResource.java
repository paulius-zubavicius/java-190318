/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l13.unittests.library.resources;

import com.vcs.lects.l13.unittests.library.Book;
import java.util.List;

/**
 *
 * @author owr
 */
public interface IBookResource {

    List<Book> getAllBooks();
    
    List<Book> getAvailableBooks();

}
