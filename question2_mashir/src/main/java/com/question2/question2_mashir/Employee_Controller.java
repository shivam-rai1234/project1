package com.question2.question2_mashir;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee_Controller {
	@Autowired
	private EmployeeRepo er;
	@GetMapping("/id") 
	public ArrayList<String> getempname(){
		ArrayList<String> enames=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		enames.add(emt.getEmp_name());
    	}
    	return enames;
	}
}