package com.example.crudoperation.crudoperation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private EmployeeRepo er;
	
	
	@GetMapping("/id")
	public ArrayList<Integer> getSample() {
		ArrayList<Integer> transformedvalues = new ArrayList<Integer>();
		for (EmployeeEntity emt : er.findAll()) {
			EmployeeEntity temp = new EmployeeEntity();
			
			temp.setEmpid(emt.getEmpid());
			transformedvalues.add(temp.getEmpid());
		}
		return transformedvalues;
	}
}
