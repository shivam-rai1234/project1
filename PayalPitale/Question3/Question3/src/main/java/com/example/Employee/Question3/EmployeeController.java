package com.example.Employee.Question3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
    private EmployeeRepo er;
    @GetMapping("/A") 
	
	public List<String> getsample3(){
		ArrayList<String> transformedvalues=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		if(emt.getEmployee_name().startsWith("a")){
    		transformedvalues.add(emt.getEmployee_name());
    		}	
    		
    	}
    	return transformedvalues;
	}
}
