package com.employee.emp_partheev;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class EmployeeController {
	@Autowired
	private EmployeeRepo er;
	@GetMapping("/id") 
	public ArrayList<String> getempname(){
		ArrayList<String> enames=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		enames.add(emt.getEmployee_name());
    	}
    	return enames;
	}
}
