package com.example.assignment3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@Autowired
	private EmployeeRepo er;

	@GetMapping("/Id")
	public List<Integer> getSample() {
		ArrayList<Integer> transformedvalues = new ArrayList<Integer>();
		for (EmployeeEntity emt : er.findAll()) {
			EmployeeEntity temp = new EmployeeEntity();
			temp.setEmpId(emt.getEmpId());
			transformedvalues.add(temp.getEmpId());
		}	
		return transformedvalues;
	}
}
