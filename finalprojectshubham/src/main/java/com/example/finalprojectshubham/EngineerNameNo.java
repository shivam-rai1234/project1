package com.example.finalprojectshubham;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EngineerNameNo {

	@Autowired
	private EngineerRepoJPA er;//up to date

	
	  @GetMapping("/engineerswhodidntaskedthequestion")
	  
	  public List<String> getSample()
	  { 
		  ArrayList<String> empnamesfroma = new ArrayList<>();
	  
	  for(EngineerEntity emt : er.findAll()) {	  
	  EngineerEntity temp=new EngineerEntity();
	  
	// the column 'asked_question' acts as a flag here
	  if(emt.getQuestion_asked().startsWith("n")) 
		  
	  empnamesfroma.add(emt.getEngineer_name()); 
	  } 
	  return empnamesfroma; }
	 

}