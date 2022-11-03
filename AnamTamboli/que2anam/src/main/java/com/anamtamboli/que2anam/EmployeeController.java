package com.anamtamboli.que2anam;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepo er;
	@GetMapping("/Id") 
	public List<String> getSample1(){
		List<String> transformedvalues=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		
    		
    		transformedvalues.add(emt.getEmp_name());
    	}
    	return transformedvalues;
	}

}
