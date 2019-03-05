
package com.LordOzar.SpringSzkolenie.service;
import com.LordOzar.SpringSzkolenie.domain.Author;
import com.LordOzar.SpringSzkolenie.domain.Book;
import com.LordOzar.SpringSzkolenie.repository.AuthorRepository;
import com.LordOzar.SpringSzkolenie.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;

import java.util.ArrayList;
import java.util.List;


@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    public List<Book> getBooks(){
        return new ArrayList<>(bookRepository.getBooks());
    }

    public void saveBook(Book book){
        if(book != null){
            System.out.println("Zapisuje książkę o id: " + book.getId());
            boolean bookExists = bookRepository.getBook(book.getId()) != null;
            System.out.println(bookExists);

            if(bookExists) {
                authorRepository.updateAuthor(book.getAuthor());
                bookRepository.updateBook(book);
            }else {
                authorRepository.saveAuthor(book.getAuthor());
                bookRepository.saveBook(book);
            }
        }
    }

    public void removeBook(int id){
        Book bookToRemove = bookRepository.getBook(id);
        Author authorToRemove = bookToRemove.getAuthor();

        bookRepository.removeBook(bookToRemove);
        authorRepository.removeAuthor(authorToRemove);
    }

    public Book getNewBook(){
        Book newBook = new Book();
        newBook.setAuthor(new Author());
        return newBook;
    }

    public Book getBook(int id){
        return bookRepository.getBook(id);
    }

//java16

    public List<Book> getBooksByAuthor (String name) {
        if (name != null)
            return new ArrayList<>(bookRepository.getBooksByAuthor(name));
        else
            return null;
    }


    public List<Book> getBooks(Integer year, String publisher, String isbn) {
        return new ArrayList<>(bookRepository.getBooks(year, publisher, isbn));
    }

    public List<Book> getBooksByTitle(String title) {
        if(title != null)
            return new ArrayList(bookRepository.getBooksByTitle(title));
        else
            return null;
    }


}