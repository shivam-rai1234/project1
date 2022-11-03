package com.example.ques2Nidhi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepo er;
	
	@GetMapping("/ids")
	public List<String> getid() {
		ArrayList<String> values=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		String name;
    		name = emt.getEmpname();
    		values.add(name);
    	}
    	return values;
	}

}
