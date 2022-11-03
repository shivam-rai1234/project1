package com.example.Q3;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@Autowired
	private EmployeeRepo er;
	
	@GetMapping("/a")
	public ArrayList<EmployeeEntity> getEasy() {
		ArrayList<EmployeeEntity> tfv = new ArrayList<EmployeeEntity>();
		for (EmployeeEntity emt : er.findAll()) {
			EmployeeEntity tempor = new EmployeeEntity();
			if(emt.getEmpName().startsWith("A")) {
				tempor.setEmpName(emt.getEmpName());
			}
			if(emt.getEmpName().startsWith("a")) {
				tempor.setEmpName(emt.getEmpName());
			}
			tfv.add(tempor);
			
		}
		return tfv;
	}
}
