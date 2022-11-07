package com.KPI.LibraryWebApplication;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.KPI.LibraryWebApplication.entity.Book;
import com.KPI.LibraryWebApplication.repository.BookRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookRepositoryTest {
	@Autowired
	private BookRepository bookrepository_ob;
	
	@Test
	public void getDetailsbyIdTest() {
		List<Book> actualOutput= bookrepository_ob.getBookDetails(1);
		
		assertEquals("George RR Martin",actualOutput.get(0).getAuthor());
		assertEquals(1996,actualOutput.get(0).getPublishing_year());
		assertEquals("A Song of Ice and Fire",actualOutput.get(0).getTitle());
		assertEquals("9780553573404",actualOutput.get(0).getISBN());
		
	}

}