package com.employee.Q2_Partheev;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmplyeeRepo er;//up to date
	@GetMapping("/id") 
	public ArrayList<String> getempname(){
		ArrayList<String> enames=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		enames.add(emt.getEmployee_name());
    	}
    	return enames;
	}
}
