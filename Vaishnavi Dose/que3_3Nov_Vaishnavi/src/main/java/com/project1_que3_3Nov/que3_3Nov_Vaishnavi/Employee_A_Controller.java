package com.project1_que3_3Nov.que3_3Nov_Vaishnavi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee_A_Controller 
{
	@Autowired
	private EmployeeRepo er;
	
	@GetMapping("/A")
	public List<EmployeeEntity> getjoin1(){
		
		return er.getjoin("a");
	}
}