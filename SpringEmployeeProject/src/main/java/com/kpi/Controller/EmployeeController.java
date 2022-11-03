package com.kpi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kpi.Entity.Employee;
import com.kpi.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;

	@GetMapping("/id")
	public List<Employee> findAllEmployee() {
		
		return service.getEmployee();
		
	}
	
}
