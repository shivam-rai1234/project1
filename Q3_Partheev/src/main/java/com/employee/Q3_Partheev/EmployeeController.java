package com.employee.Q3_Partheev;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepo er;//up to date
	@GetMapping("/A") 
	public ArrayList<String> getempname(){
		ArrayList<String> eid=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		if(emt.getEmployee_name().startsWith("A")||emt.getEmployee_name().startsWith("a"))
    		eid.add(emt.getEmployee_name());
    	}
    	return eid;
	}
}
