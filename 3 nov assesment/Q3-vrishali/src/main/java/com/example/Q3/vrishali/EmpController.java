package com.example.Q3.vrishali;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	@Autowired
	private EmpRepo erepo;
	
	@Autowired
	private EmpService service;
	
	// get all employee records whose name start with letter 'a'
	
	@GetMapping("/A")  
	public ArrayList<String> getempname()
	{	
		ArrayList<String> employee= new ArrayList<String>();
    	for(EmpEntity em:erepo.findAll()) 
    	{	
    		if (em.getName().startsWith("a")) {
            employee.add(em.getName());
            System.out.println("Employee starting with a letter:"+em.getName()); // to print output in console
    	}	
    	}
    	return employee;
	}
	
	// for all employee details
	@GetMapping("/detail")	
	public List<EmpEntity> getdetail(){	
		return service.getall();
	}
	
}
