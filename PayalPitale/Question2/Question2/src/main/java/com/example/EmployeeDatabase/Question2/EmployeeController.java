package com.example.EmployeeDatabase.Question2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepo e;
	
	@GetMapping("/id") 
	public List<String> getid(){
		ArrayList<String> ename=new ArrayList<String>();
    	for(EmployeeEntity emt:e.findAll()) {
    		ename.add(emt.getEmployee_name()); 
    		}
    	return ename;
	}
}
    	
    		
    	
    	
    	
    	
	


