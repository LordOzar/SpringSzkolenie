package com.LordOzar.SpringSzkolenie.controller;
import com.LordOzar.SpringSzkolenie.domain.Book;
import com.LordOzar.SpringSzkolenie.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.ui.Model;

import java.util.List;

public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String getBooks(Model model){
        List<Book> books = bookService.getBooks();
        //przekazywanie obiektów book do html za pomocą klasy Model
        model.addAttribute("books", books);
        return "books";
    }


}
