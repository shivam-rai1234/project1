package com.example.assignment3;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepo er;
	@GetMapping("/A") 
	public List<EmployeeEntity> getSample3(){
		ArrayList<EmployeeEntity> transformedvalues=new ArrayList<EmployeeEntity>();
		for(EmployeeEntity emt:er.findAll()) {
			EmployeeEntity temp = new EmployeeEntity();
			if(emt.getEmp_name().startsWith("a")) {
			
			temp.setEmpid(emt.getEmpid());
			temp.setEmp_name(emt.getEmp_name());
			transformedvalues.add(temp);
			}
	}	
		return transformedvalues;
	}
}
