package com.LordOzar.SpringSzkolenie;

import com.LordOzar.SpringSzkolenie.domain.Book;
import com.LordOzar.SpringSzkolenie.repository.BookRepository;
import com.LordOzar.SpringSzkolenie.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:custom.properties")
@Component
public class AppStarter implements CommandLineRunner{

    @Autowired
    BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        init();

    }

    public void init(){
        Book book = new Book("Przygody Witka", 2018, "Nova", "523 622 689");
        bookRepository.saveBook(book);
        //BookRepository.saveBook(book);
        //BookService.saveBook(book);

    }

}