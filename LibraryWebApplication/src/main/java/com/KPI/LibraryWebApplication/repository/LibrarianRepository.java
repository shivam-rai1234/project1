package com.KPI.LibraryWebApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.KPI.LibraryWebApplication.entity.Librarian;

@Repository
public interface LibrarianRepository extends JpaRepository<Librarian, Long>{
	@Query(value="SELECT * From Librarian where employee_id =?1",nativeQuery = true)
	public List<Librarian> getLibrarianDetails(Integer id);
	
	@Query(value="SELECT * From Librarian ",nativeQuery = true)
	public List<Librarian> getAllLibrarianDetails();

}
