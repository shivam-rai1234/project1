package com.example.Q2.vrishali;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepo repo;
	

	@GetMapping("/id") 
	public ArrayList<String> getempId(){
		ArrayList<String> ename= new ArrayList<String>();
    	for(EmployeeEntity em:repo.findAll()) {
            ename.add(em.getName());
    	}	
    	return ename;
     }
}
