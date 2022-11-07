package com.KPI.LibraryWebApplication.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.KPI.LibraryWebApplication.entity.Librarian;
import com.KPI.LibraryWebApplication.repository.LibrarianRepository;

@RestController
public class LibrarianController {
	@Autowired
	private LibrarianRepository librarianrepository;
	
	@GetMapping("/librarian{id}")
	public List<Librarian> getDetailsByID(@PathVariable("id") Integer id){
		return librarianrepository.getLibrarianDetails(id);
	}
	
	@GetMapping("/librarian")
	public List<Librarian> getAllDetails(){
		return librarianrepository.getAllLibrarianDetails();
	}
	

}
