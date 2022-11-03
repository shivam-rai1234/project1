package com.kpi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kpi.entity.Employee;
import com.kpi.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/a")									// Performance check done with actuator.
	public List<Employee> getByEmployeeFirstAlphabet() {
		return service.fetchAllEmployeeByCharacterA();
	}

}
