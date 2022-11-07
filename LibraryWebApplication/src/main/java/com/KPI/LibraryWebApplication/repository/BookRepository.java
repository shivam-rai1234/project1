package com.KPI.LibraryWebApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.KPI.LibraryWebApplication.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{
	@Query(value="SELECT * From Book where id =?1",nativeQuery = true)
	public List<Book> getBookDetails(Integer id);
	
	@Query(value="SELECT * From Book ",nativeQuery = true)
	public List<Book> getAllBookDetails();

}
