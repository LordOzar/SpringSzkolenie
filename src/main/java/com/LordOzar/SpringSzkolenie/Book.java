package com.LordOzar.SpringSzkolenie;

import org.springframework.stereotype.Component;

@Component
public class Book {
    private String title;
    private String publisher;
    private int year;
    private String isbn;

    public Book() {
        this.title = "kamasutra";
        this.year = 007;
        this.publisher = "Ożar";
        this.isbn = "1";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
