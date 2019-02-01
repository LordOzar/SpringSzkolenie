package com.LordOzar.SpringSzkolenie.service;
import com.LordOzar.SpringSzkolenie.domain.Book;
import com.LordOzar.SpringSzkolenie.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<Book> getBooks(){
        return new ArrayList<>(bookRepository.getBooks());
    }

    public void saveBook(Book book){
        bookRepository.saveBook(book);
    }

}
