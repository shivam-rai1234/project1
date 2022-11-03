package com.kpi.employee_details;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
public class Controller {
	
	@Autowired
	private EmployeeRepo er;
	
	@GetMapping("/id")
		public List<String> getdata(){
			ArrayList<String> name=new ArrayList<String>();
	    	for(EmployeeEntity emp:er.findAll()) {
	    		name.add(emp.getName());
	    		
	    	}
	    	return name;
		}
	}

	

