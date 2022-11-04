package com.example.Q3Shubham;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeNameFromAController {


	@Autowired
	private EmployeeRepo er;//up to date

	
	  @GetMapping("/a")
	  
	  public List<String> getSample()
	  { 
		  ArrayList<String> empnamesfroma = new ArrayList<>();
	  
	  for(EmployeeEntity emt : er.findAll()) {	  
	  EmployeeEntity temp=new EmployeeEntity();
	  if(emt.getEmployee_name().startsWith("a")) 
		  
	  empnamesfroma.add(emt.getEmployee_name()); 
	  } 
	  return empnamesfroma; }
	 

}