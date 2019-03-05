package com.LordOzar.SpringSzkolenie;

import com.LordOzar.SpringSzkolenie.domain.Author;
import com.LordOzar.SpringSzkolenie.domain.Book;
import com.LordOzar.SpringSzkolenie.repository.BookRepository;
import com.LordOzar.SpringSzkolenie.service.UserService;
import com.LordOzar.SpringSzkolenie.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource("classpath:custom.properties")
public class AppStarter implements CommandLineRunner {

    @Autowired
    BookService bookService;

    @Autowired
    UserService userService;

    @Override
    public void run(String... args) throws Exception {
        init();
    }

    public void init(){
        Book book = new Book("Zbyszek i Totolotek", 2000, "Ożar Entertainment", "001", new Author("Zbyszek Lotto"));
        bookService.saveBook(book);

        Book book2 = new Book("Informatyki, czyli jak się nie narobić a zarobić", 1984, "Ożar Entertainment", "002", new Author("Bill Gates"));
        bookService.saveBook(book2);

        Book book3 = new Book("Korpo Bełkot - słownik polsko/amerykańsko korporacyjny", 2018, "Ożar Entertainment", "003", new Author("brak"));
        bookService.saveBook(book3);
    }

    public void initUsers() {

        userService.createUser("admin", "pass");

        userService.addRoleToUser("admin", "ADMIN");
        userService.addRoleToUser("admin", "DEV");
        userService.addRoleToUser("admin", "USER");

        userService.createUser("user", "pass");
        userService.addRoleToUser("user", "USER");
    }

}