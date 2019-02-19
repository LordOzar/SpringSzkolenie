package com.LordOzar.SpringSzkolenie;

import com.LordOzar.SpringSzkolenie.domain.Book;
import com.LordOzar.SpringSzkolenie.repository.BookRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringSzkolenieApplicationTests {

	@Autowired
	BookRepository bookRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void getBooksByAuthorTest(){
		Collection<Book> books = bookRepository.getBooksByAuthor("Henryk Sienkiewicz");
		System.out.println("Book size >>> " + books.size());
		System.out.println("Content >>> " + books);
		assert books.size() == 3;
	}


}

