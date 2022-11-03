package com.Q2.Q2Piyush;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PiyushBodhani
 * you can find the image of table above pom.xml
 */
@RestController
public class Controller {
	@Autowired
	private EmployeeeeRepository er;
	@GetMapping("/id")
	public List<String> getdata(){
		ArrayList<String> name=new ArrayList<String>();
    	for(EmployeeeeEntity emt:er.findAll()) {
    		name.add(emt.getEm_name());
    		
    	}
    	return name;
	}
}