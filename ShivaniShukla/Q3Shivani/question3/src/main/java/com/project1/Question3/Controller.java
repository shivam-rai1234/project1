package com.project1.Question3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	@Autowired
    private EmployeeRepo e;
	
	@GetMapping("/A")
	public List<EmployeeEntity> getjoin(){
		
		return e.getjoin1("A");
	
	}}