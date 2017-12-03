package com.carlmung.rest.pcweb.controller;

import com.carlmung.rest.pcweb.Book;
import com.carlmung.rest.pcweb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/book", method = RequestMethod.PUT, produces = "application/json")
    public void bookPut(@RequestBody Book book) {
        System.out.println(book.toString());
        bookService.bookPut(book);
    }
}
