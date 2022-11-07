package com.KPI.LibraryWebApplication;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.KPI.LibraryWebApplication.entity.Librarian;
import com.KPI.LibraryWebApplication.repository.LibrarianRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibrarianRepositoryTest {
	@Autowired
	private LibrarianRepository libRepository_ob;
	
	@Test
	public void getDetailsbyIdTest() {
		List<Librarian> actualOutput= libRepository_ob.getLibrarianDetails(1);
		
		assertEquals("Amish",actualOutput.get(0).getEmployee_name());
		assertEquals("Assistant Librarian",actualOutput.get(0).getDesignation());
		
	}

}